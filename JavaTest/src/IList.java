/**
 * ������б�List�������ڴ洢һϵ�е�Ԫ�أ����󣩡�
 * IList����洢��Ԫ�ػᰴ�����˳���ŷţ�Ҳ�ܸ����±��ȡ��ЩԪ�ء��±��0��ʼ��
 */
public interface IList {
  /**
   * ���б��β������һ��Ԫ��
   */
  void add(Object elem);
  /**
   * ��ȡ�±���ָ����Ԫ�ء����±�Խ��ʱ�׳�java.lang.IndexOutOfBoundsException
   */
  Object get(int index);
  /**
   * ��ȡ�б��ﵱǰ��Ԫ�ظ���
   */
  int size();
  /**
   * ����б��Ƴ��б������е�Ԫ��
   */
  void clear();
}