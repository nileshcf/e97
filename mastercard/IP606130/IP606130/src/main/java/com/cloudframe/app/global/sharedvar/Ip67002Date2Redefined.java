package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002Date2Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip67002Date2Redefined extends Ip67002Date2RedefinedSerialized { 
   

								@Getter @Setter private int ip67002Ccyy2;
				@Getter @Setter private Ip67002Ccyy2Redefined ip67002Ccyy2Redefined = new Ip67002Ccyy2Redefined();
				@Getter @Setter private Ip67002Mmdd2 ip67002Mmdd2 = new Ip67002Mmdd2();
				@Getter @Setter private Ip67002Jddd2 ip67002Jddd2 = new Ip67002Jddd2();
	
	/**
	* Constructor for Ip67002Date2Redefined
	**/
    public Ip67002Date2Redefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip67002Date2Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Date2Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp67002Ccyy2Redefined().setParent(this,getStartOffset() + 0);
					getIp67002Mmdd2().setParent(this,getStartOffset() + 4);
					getIp67002Jddd2().setParent(this,getStartOffset() + 4);
    } 

	/**
	 * 	initializes Ip67002Date2Redefined
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002Ccyy2(0);
          getIp67002Mmdd2().initialize();
     
   }


}
  
