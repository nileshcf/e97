package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip570004Tbl57PointerData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:46. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip570004Tbl57PointerData extends Ip570004Tbl57PointerDataSerialized { 
   

								@Getter @Setter private int ip570004Tbl57RelRecNumSt;

								@Getter @Setter private int ip570004Tbl57RelRecNumEnd;

								@Getter @Setter private long ip570004Tbl57CabGpEntrySt;

								@Getter @Setter private long ip570004Tbl57CabGpEntryLt;
	
	/**
	* Constructor for Ip570004Tbl57PointerData
	**/
    public Ip570004Tbl57PointerData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip570004Tbl57PointerData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip570004Tbl57PointerData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip570004Tbl57PointerData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp570004Tbl57RelRecNumSt(0);
                     setIp570004Tbl57RelRecNumEnd(0);
                     setIp570004Tbl57CabGpEntrySt(0);
                     setIp570004Tbl57CabGpEntryLt(0);
   }


}
  
