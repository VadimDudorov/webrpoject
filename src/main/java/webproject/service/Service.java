package webproject.service;

public interface Service<T> {
    T launch(T ... params);
}
