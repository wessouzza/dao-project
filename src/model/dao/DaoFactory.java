package model.dao;

import db.DB;
import model.dao.imp.DepartmentDaoJDBC;
import model.dao.imp.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartementDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
