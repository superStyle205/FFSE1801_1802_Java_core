package view.component.panel.heThong.tuyChon;

import java.util.Arrays;
import java.util.List;

import org.jdesktop.swingx.JXTreeTable;
import org.jdesktop.swingx.treetable.DefaultTreeTableModel;



public class treetable {
	private String[] headings = {"Dữ Liệu","Giá Trị"};
	  private node root;
	  private DefaultTreeTableModel model;
	  private JXTreeTable table;
	  private List<String[]> content;
	  
	  public treetable(List<String[]> content) {
	  this.content = content;
	  
	}
	  
	  public JXTreeTable gettreetable() {
		  root = new root("Root");
		  
		  
		  child mychill = null;
		  for(String[] data : this.content) {
			  child child = new child(data);
			  if (data.length <=1) {
				  root.add(child);
				  mychill = child;
				  
			  }else {
				  mychill.add(child);
			  }
		  }
		  
		  model = new DefaultTreeTableModel(root,Arrays.asList(headings));
		  table = new JXTreeTable(model);
		  table.setShowGrid(true, true);
		  table.setColumnControlVisible(true);
		  
		  table.packAll();
		  
		  return table;
	  }
}
