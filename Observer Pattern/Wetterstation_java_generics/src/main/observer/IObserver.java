package main.observer;

public interface IObserver<T> {
    void update(T subject);
}
