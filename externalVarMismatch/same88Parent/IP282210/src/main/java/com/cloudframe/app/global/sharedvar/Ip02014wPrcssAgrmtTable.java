package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014wPrcssAgrmtTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip02014wPrcssAgrmtTable extends Ip02014wPrcssAgrmtTableSerialized { 
   
				@Getter @Setter private Ip02014wTableDataKey ip02014wTableDataKey = new Ip02014wTableDataKey();
				@Getter @Setter private Ip02014wTableDataFields ip02014wTableDataFields = new Ip02014wTableDataFields();
	
	/**
	* Constructor for Ip02014wPrcssAgrmtTable
	**/
    public Ip02014wPrcssAgrmtTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip02014wPrcssAgrmtTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014wPrcssAgrmtTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp02014wTableDataKey().setParent(this,getStartOffset() + 0);
					getIp02014wTableDataFields().setParent(this,getStartOffset() + 11);
    } 

	/**
	 * 	initializes Ip02014wPrcssAgrmtTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp02014wTableDataKey().initialize();
     
          getIp02014wTableDataFields().initialize();
     
   }


}
  
