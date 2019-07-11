package view.component.panel.heThong.tuyChon;



import org.jdesktop.swingx.treetable.AbstractMutableTreeTableNode;

public class node extends AbstractMutableTreeTableNode  {

	public node(Object[]data) {
		super(data);
		
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return getdata().length;
	}
 
	
	@Override
	public Object getValueAt(int columIndex) {
		// TODO Auto-generated method stub
		return getdata()[columIndex];
	}
	
	public Object[] getdata() {
		return (Object[]) getUserObject();
	}

	 
	
}