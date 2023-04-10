package egirenaldi.pencatatan.buku;

import javax.sql.DataSource;

import egirenaldi.pencatatan.buku.Util.DatabaseUtil;
import egirenaldi.pencatatan.buku.repository.BookRepository;
import egirenaldi.pencatatan.buku.service.BookService;

import egirenaldi.pencatatan.buku.repository.impl.BookRepositoryImpl;
import egirenaldi.pencatatan.buku.service.impl.BookServiceImpl;
import egirenaldi.pencatatan.buku.view.BookView;

public class App {
    public static void main( String[] args )
    {
        // datasource
        DataSource dataSource = DatabaseUtil.getDataSource();

        //set data
        BookRepository bookRepository = new BookRepositoryImpl(dataSource);
        BookService bookService = new BookServiceImpl(bookRepository);

        
        //view
        BookView bookView =  new BookView(bookService);

        //show view
        bookView.showMenu();
    }
}
