package me.stark.tony.listactivity;

/**
 * 描述:                    <br>
 * 作者:Stark.Tony                 <br>
 * 日期:2016/11/30             <br>
 */
public class Functiions {

  public Class<?> clazz;
  public String name;

  public Functiions(Class<?> clazz, String name) {
    this.clazz = clazz;
    this.name = name;
  }

  @Override public String toString() {
    return name;
  }
}
