package com.databases.music;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Datasource {
    public static final String DB_NAME = "music.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\tr_lnd_user\\Desktop\\Java\\Java-ACN-2018\\java-acn-cmccr-2018\\"+ DB_NAME;

    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";
    public static final int INDEX_ALBUM_ID=1;
    public static final int INDEX_ALBUM_NAME=2;
    public static final int INDEX_ALBUM_ARTIST=3;

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";
    public static final int INDEX_ARTIST_ID =1;
    public static final int INDEX_ARTIST_NAME =2;

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONG_ID = "_id";
    public static final String COLUMN_SONG_TRACK = "track";
    public static final String COLUMN_SONG_TITLE = "title";
    public static final String COLUMN_SONG_ALBUM = "album";
    public static final int INDEX_SONG_ID =1;
    public static final int INDEX_SONG_TRACK =2;
    public static final int INDEX_SONG_TITLE =3;
    public static final int INDEX_SONG_ALBUM =4;

    public static final int ORDER_BY_NONE = 1;
    public static final int ORDER_BY_ASC = 2;
    public static final int ORDER_BY_DESC = 3;

    public static final String QUERY_ALBUMS_BY_ARTIST_START =
            "SELECT " + TABLE_ALBUMS + '.' + COLUMN_ALBUM_NAME + " FROM " + TABLE_ALBUMS +
                    " INNER JOIN " +TABLE_ARTISTS + " ON " + TABLE_ALBUMS + "." + COLUMN_ALBUM_ARTIST +
                    " = " + TABLE_ARTISTS + "." + COLUMN_ARTIST_ID +
                    " WHERE " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + " =";

    public static final String QUERY_ALBUMS_BY_ARTIST_SORT =
            " ORDER BY " + TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + " COLLATE NOCASE ";

    public static final String QUERY_VIEW_TABLE_ARTISTS = "select * from "+TABLE_ARTISTS;
    public static final String QUERY_ORDER_BY_ARTIST_SORT = " order by "+COLUMN_ARTIST_NAME+" collate nocase ";


    private Connection conn;

    public boolean open(){
        try{
            conn = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        }catch(SQLException e){
            System.out.println("Error connecting to databse: "+e.getMessage());
            return false;
        }
    }

    public void close(){
        try{
            if(conn!=null){
                conn.close();
            }
        }catch(SQLException e){
            System.out.println("Error closing: "+e.getMessage());
        }
    }

    public List<Artist> queryArtists(int sortOrder){

        StringBuilder sb = new StringBuilder(QUERY_VIEW_TABLE_ARTISTS);
        if(sortOrder!= ORDER_BY_NONE){
            sb.append(QUERY_ORDER_BY_ARTIST_SORT);
            if(sortOrder==ORDER_BY_DESC){
                sb.append("DESC");
            }else {
                sb.append("ASC");
            }
        }


        try(Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery(sb.toString())){


            List<Artist> artists = new ArrayList<>();
            while(results.next()){
                Artist artist = new Artist();
                artist.setId(results.getInt(INDEX_ARTIST_ID));
                artist.setName(results.getString(INDEX_ARTIST_NAME)); //overloaded method that either int or string is allowed
                artists.add(artist);
            }

            return artists;

        }catch(SQLException e){
            System.out.println("Query failed: " +e.getMessage());
            return null;
        }


    }

    public List<String> queryAlbumsForArtist(String artistName, int sortOrder){


        //select albums.name from albums inner join artists on albums.artist = artists._id where artists.name="Carole King" order by albums.name collate nocase
        StringBuilder sb = new StringBuilder(QUERY_ALBUMS_BY_ARTIST_START);
//        sb.append(TABLE_ALBUMS);
//        sb.append(".");
//        sb.append(COLUMN_ALBUM_NAME);
//        sb.append(" FROM ");
//        sb.append(TABLE_ALBUMS);
//        sb.append(" INNER JOIN ");
//        sb.append(TABLE_ARTISTS);
//        sb.append(" ON ");
//        sb.append(TABLE_ALBUMS);
//        sb.append(".");
//        sb.append(COLUMN_ALBUM_ARTIST);
//        sb.append(" = ");
//        sb.append(TABLE_ARTISTS);
//        sb.append(".");
//        sb.append(COLUMN_ARTIST_ID);
//        sb.append(" WHERE ");
//        sb.append(TABLE_ARTISTS);
//        sb.append(".");
//        sb.append(COLUMN_ARTIST_NAME);
//        sb.append("=");
        sb.append("\""+artistName+"\"");

        if(sortOrder!= ORDER_BY_NONE){
            sb.append(QUERY_ALBUMS_BY_ARTIST_SORT);
//            sb.append(" ORDER BY ");
//            sb.append(TABLE_ALBUMS);
//            sb.append(".");
//            sb.append(COLUMN_ALBUM_NAME);
//            sb.append(" collate nocase ");
            if(sortOrder==ORDER_BY_DESC){
                sb.append("DESC");
            }else {
                sb.append("ASC");
            }
        }

        System.out.println("SQL statement =" + sb.toString());

        try(Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery(sb.toString())){

            List<String> albums = new ArrayList<>();
            while(results.next()){
                albums.add(results.getString(1));
            }

            return albums;

        }catch(SQLException e){
            System.out.println("Query failed: "+e.getMessage());
            return null;
        }

    }
}