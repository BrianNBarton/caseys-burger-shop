package model;

// This DAO factory class has a windo into every Bean type we create
//this class has a magic claw for each bean type
public class DaoFactory {

    //we dont want to require accessing the burgersDao
    //directly, instead, we want to referense its interface
    private static Burgers burgersDao;
    private static Sodas sodasDao;
    private static Ingredients ingredientsDao;

    //any bean type we have will get a method called
    // get[Bean]Dao()
    public static Burgers getBurgersDao() {
        if (burgersDao == null) {
            burgersDao = new BurgersDao();
        }
        return burgersDao;
    }


    public static Ingredients getIngredientsDao() {
        if (ingredientsDao == null) {
            ingredientsDao = new IngredientsDao();
        }
        return ingredientsDao;
    }

    public static Sodas getSodasDao() {
        if (sodasDao == null) {
            sodasDao = new SodasDao();
        }
        return sodasDao;
    }

}