package com.cloudframe.app.o529351u.dto;

/**
*  The class TableItem is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class TableItem extends TableItemSerialized { 
   

								@Getter @Setter private long genericTransl;
	
	/**
	* Constructor for TableItem
	**/
    public TableItem() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for TableItem. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TableItem(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
