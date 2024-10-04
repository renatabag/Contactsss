package ru.yandex.practicum.contacts.presentation.base;

import ru.yandex.practicum.contacts.model.ContactType;
import ru.yandex.practicum.contacts.presentation.filter.model.FilterContactType;
import ru.yandex.practicum.contacts.presentation.sort.model.SortType;

public interface ListDiffInterface<T> {
    boolean theSameAs(FilterContactType t);

    boolean theSameAs(SortType t);

    boolean theSameAs(ContactType t);

    public boolean theSameAs(T t);
    public boolean equals(Object o);
}
