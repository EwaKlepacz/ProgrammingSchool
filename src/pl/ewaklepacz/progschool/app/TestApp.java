package pl.ewaklepacz.progschool.app;

import pl.ewaklepacz.progschool.util.DBUtil;
import java.sql.SQLException;

public class TestApp {
    public static void main(String[] args) {
        DBUtil.connect();
    }
}
