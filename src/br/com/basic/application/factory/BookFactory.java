package br.com.basic.application.factory;

import br.com.basic.application.datasource.IBookDataSource;

public class BookFactory {

    /**
     * @param sourceBookEnum @see br.com.basic.application.factory.BookDataSourceEnum
     * @return @see br.com.basic.application.datasource.IBookDataSource
     */
    public static IBookDataSource createBookFactory(final SourceBookEnum sourceBookEnum) {
        if (sourceBookEnum.equals(SourceBookEnum.CSV)) {
            //TODO Implement CSV
            return null;
        } else if (sourceBookEnum.equals(SourceBookEnum.DATABASE)) {
            // TODO Implement Database
            return null;
        }
        throw new IllegalArgumentException("Source Book not found");
    }
}
