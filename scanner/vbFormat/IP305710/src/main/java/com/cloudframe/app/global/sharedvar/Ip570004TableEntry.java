package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip570004TableEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:46. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip570004TableEntry extends Ip570004TableEntrySerialized { 
   

								@Getter @Setter private long ip570004Tbl57PcCabGrpPtr;
				@Getter @Setter private Ip570004Tbl57PointerData ip570004Tbl57PointerData = new Ip570004Tbl57PointerData();
	
	/**
	* Constructor for Ip570004TableEntry
	**/
    public Ip570004TableEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip570004TableEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip570004TableEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp570004Tbl57PointerData().setParent(this,getStartOffset() + 6);
    } 

	/**
	 * 	initializes Ip570004TableEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp570004Tbl57PcCabGrpPtr(0);
          getIp570004Tbl57PointerData().initialize();
     
   }


}
  
