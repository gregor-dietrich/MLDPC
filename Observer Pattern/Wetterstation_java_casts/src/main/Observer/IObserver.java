package main.Observer;

import main.Subject.ASubject;

public interface IObserver {
    void update(final ASubject subject);
}
