package main.observer;

public interface IObserver<T> {
    void update(final T subject);
}
