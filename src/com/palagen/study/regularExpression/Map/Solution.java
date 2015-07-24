package com.palagen.study.regularExpression.Map;

import java.util.HashMap;
import java.util.Map;

/* ������� �����, ������� ���������� �����
������� ������� (Map<String, String>) ������� � ���� ������ ������� �� �������� ��������� - �����.
������� �����, ������� ���������� �����.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();

        map.put("������", "������");
        map.put("�������", "�����");
        map.put("����������", "������");
        map.put("�����", "�������");
        map.put("�����", "���������");
        map.put("�����", "�����");
        map.put("�������", "���������");
        map.put("����������", "���������");
        map.put("��������", "�����");
        map.put("�������", "�����");//�������� ��� ��� ���

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //�������� ���������� ���� 2 ����
        HashMap<String, String> map2 = new HashMap<String, String>(map);
        HashMap<String, String> map3 = new HashMap<String, String>(map);

        //���� �� map2
        for (Map.Entry<String, String> pair : map2.entrySet())
        {
            //������� �� map3 ����, ������� ������������� pair
            map3.remove(pair.getKey());
            //��������� �� ������  � map3 �������� ��������������� �������� �� pair
            if (map3.containsValue(pair.getValue()))
            {   //���� ���� ����� �� �������� - �������� �������� ��������� �������� pair �� ���������� map
                removeItemFromMapByValue(map, pair.getValue());
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }


}