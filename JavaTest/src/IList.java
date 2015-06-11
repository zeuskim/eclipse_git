/**
 * 精简的列表（List），用于存储一系列的元素（对象）。
 * IList里面存储的元素会按插入的顺序排放，也能根据下标获取这些元素。下标从0开始。
 */
public interface IList {
  /**
   * 往列表的尾部增加一个元素
   */
  void add(Object elem);
  /**
   * 获取下标所指定的元素。当下标越界时抛出java.lang.IndexOutOfBoundsException
   */
  Object get(int index);
  /**
   * 获取列表里当前的元素个数
   */
  int size();
  /**
   * 清空列表，移除列表里所有的元素
   */
  void clear();
}