/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.lisp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shin
 */
public class CalculatorTest {
    
    /**
     *2引数とも正整数の場合のテスト<br/> 
     *対象:multiply(int,int)<br/>
     * 条件:引数10, 20<br/>
     * 期待する結果:戻り値 200<br/>
     * 
    */
    @Test
    public void testMultiply01() throws Exception {
        Calculator calc = new Calculator();
        int expected = 200;
        int actual = calc.multiply(10, 20);
        assertEquals(expected, actual);
    }
    
     /**
     *2引数とも正整数の場合のテスト<br/> 
     *対象:multiply(int,int)<br/>
     * 条件:引数 -10, 20<br/>
     * 期待する結果:戻り値 -200<br/>
     * 
    */
    
    @Test
    public void testMultiply02() throws Exception {
        Calculator calc = new Calculator();
        int expected = -200;
        int actual = calc.multiply(-10, 20);
        assertEquals(expected, actual);
    }
    
    /**
     *2引数とも正整数の場合のテスト<br/> 
     *対象:multiply(int,int)<br/>
     * 条件:引数0, -20<br/>
     * 期待する結果:戻り値 0<br/>
     * 
    */
    @Test
    public void testMultiply03() throws Exception {
        Calculator calc = new Calculator();
        int expected = 0;
        int actual = calc.multiply(0, -20);
        assertEquals(expected, actual);
    }
    
    /**
     * c > b > aの場合のテスト<br/>
     * 対象:max*(int, int, int)<br/>
     * 条件:引数 10, 20, 30<br/>
     * 期待する結果:戻り値 30 <br/>
     */
    
    @Test
    public void testMax01() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(10, 20, 30);
        assertEquals(expected, actual);
    }
    
    /**
     * a > b > cの場合のテスト<br/>
     * 対象:max*(int, int, int)<br/>
     * 条件:引数 30, 20, 10<br/>
     * 期待する結果:戻り値 30 <br/>
     */
    
    @Test
    public void testMax02() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30, 20, 10);
        assertEquals(expected, actual);
    }
    
     /**
     * b > a > cの場合のテスト<br/>
     * 対象:max*(int, int, int)<br/>
     * 条件:引数 20, 30, 10<br/>
     * 期待する結果:戻り値 30 <br/>
     */
    @Test
    public void testMax03() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(20, 30, 10);
        assertEquals(expected, actual);
    }
}
