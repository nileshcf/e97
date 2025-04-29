package com.cloudframe.app.init1.dto;

/**
*  The class WcdloDateTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WcdloDateTbl extends WcdloDateTblSerialized { 
   

								@Getter @Setter private short wcdloBlPeriodCd;
				@Getter @Setter private WcdloStartDt wcdloStartDt = new WcdloStartDt();
				@Getter @Setter private WcdloEndDt wcdloEndDt = new WcdloEndDt();

								@Getter @Setter private long wcdloStartDtIso;

								@Getter @Setter private long wcdloEndDtIso;
				@Getter @Setter private WcdloMonthEndDt wcdloMonthEndDt = new WcdloMonthEndDt();
	
	/**
	* Constructor for WcdloDateTbl
	**/
    public WcdloDateTbl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcdloDateTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloDateTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getWcdloStartDt().setParent(this,getStartOffset() + 2);
					getWcdloEndDt().setParent(this,getStartOffset() + 12);
					getWcdloMonthEndDt().setParent(this,getStartOffset() + 38);
    } 

	/**
	 * 	initializes WcdloDateTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setWcdloBlPeriodCd((short)0);
          getWcdloStartDt().initialize();
     
          getWcdloEndDt().initialize();
     
                     setWcdloStartDtIso(0);
                     setWcdloEndDtIso(0);
          getWcdloMonthEndDt().initialize();
     
   }


}
  
