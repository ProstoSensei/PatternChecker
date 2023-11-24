import org.example.Main;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestClass
{
    @Test
    void globalTest()
    {
        // Регулярное выражение для поиска времени в строке
        assertEquals("07:22", Main.timeCheck("Я пойду на завтрак в 07:22"));
        assertEquals("12:45", Main.timeCheck("В 12:45 у меня запланирована встреча."));
        assertEquals("08:26", Main.timeCheck("Сегодня в 08:26 мне пришло странное уведомление."));
        assertEquals("14:00", Main.timeCheck("Пара начинается в 14:00."));
        assertEquals("11:45", Main.timeCheck("Перемена заканчивается в 11:45."));
        assertEquals("18:00", Main.timeCheck("У меня сегодня пары, ориентировочно, до 18:00."));
        assertEquals("В указанном тексте время не найдено.", Main.timeCheck("На часах время 27:98."));
        assertEquals("В указанном тексте время не найдено.", Main.timeCheck("На часах время 27:98."));
        assertEquals("В указанном тексте время не найдено.", Main.timeCheck("На часах время 99:73."));
        assertEquals("В указанном тексте время не найдено.", Main.timeCheck("На часах время 87:78."));
        assertEquals("В указанном тексте время не найдено.", Main.timeCheck("Вчера матч завершился со счётом 71.21."));
        assertEquals("В указанном тексте время не найдено.", Main.timeCheck("Просто тестовое число. 2811"));

        // Регулярное выражение, определяющее является ли заданная строка правильным MAC-адресом
        assertTrue(Main.macCheck("aF:bB:cA:56:7b:b4"));
        assertTrue(Main.macCheck("dD:bC:eA:56:76:b4"));
        assertTrue(Main.macCheck("eF:bA:cA:56:76:54"));
        assertTrue(Main.macCheck("dF:bE:eA:e6:7E:5b"));
        assertTrue(Main.macCheck("cF:bB:cA:56:7e:a4"));
        assertTrue(Main.macCheck("bF:bD:eA:56:7a:5d"));
        assertFalse(Main.macCheck("01:23:45:67:89:Az"));
        assertFalse(Main.macCheck("05:235:12:67:89:Az"));
        assertFalse(Main.macCheck("111:663:13:aA:B9:Az"));
        assertFalse(Main.macCheck("01:a3:y5:YU7:j9:Az"));
        assertFalse(Main.macCheck("aA:bC:45:6a:89:dT"));
        assertFalse(Main.macCheck("qW:eR:tY:jK:eQ:Az"));

        // Регулярное выражение, определяющее является ли данная строчка валидным E-mail адресом согласно RFC под номером 2822
        assertTrue(Main.emailCheck("user@example.com"));
        assertTrue(Main.emailCheck("test@ya.ru"));
        assertTrue(Main.emailCheck("pochta@gmail.com"));
        assertTrue(Main.emailCheck("iawdawdawdwa@yandex.ru"));
        assertTrue(Main.emailCheck("norm-adress@ya.ru"));
        assertTrue(Main.emailCheck("prikol@mail.ru"));
        assertFalse(Main.emailCheck("@val.ru"));
        assertFalse(Main.emailCheck("bug@@@com.ru"));
        assertFalse(Main.emailCheck("Just Text2"));
        assertFalse(Main.emailCheck("test@.a.a"));
        assertFalse(Main.emailCheck("@mail.ru"));
        assertFalse(Main.emailCheck("@mail.@mail.ru"));
    }
}
