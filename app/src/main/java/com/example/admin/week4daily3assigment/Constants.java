package com.example.admin.week4daily3assigment;

/**
 * Created by Admin on 9/20/2017.
 */

public class Constants {
    public interface ACTION {
        public static String MAIN_ACTION = "com.example.admin.week4daily3assigment.action.main";
        public static String INIT_ACTION = "com.example.admin.week4daily3assigment.action.init";
        public static String Pause_ACTION = "com.example.admin.week4daily3assigment.action.pause";
        public static String PLAY_ACTION = "com.example.admin.week4daily3assigment.action.play";
        public static String STOP = "com.example.admin.week4daily3assigment.action.stop";
        public static String STARTFOREGROUND_ACTION = "com.example.admin.week4daily3assigment.action.startforeground";
        public static String STOPFOREGROUND_ACTION = "com.example.admin.week4daily3assigment.action.stopforeground";
    }

    public interface NOTIFICATION_ID {
        public static int FOREGROUND_SERVICE = 102;
    }
}
