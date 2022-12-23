package com.example.springpractice.logic;

import java.util.List;

public interface Sort <T extends Comparable<T>>{ // 정렬 기능을 제공하는 인터페이스

    List<T> sort(List<T> list); //리스트 sort메서드를 구현해야되고 입력인자는
}
