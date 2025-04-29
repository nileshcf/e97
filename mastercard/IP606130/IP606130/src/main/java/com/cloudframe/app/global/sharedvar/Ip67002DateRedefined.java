package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002DateRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip67002DateRedefined extends Ip67002DateRedefinedSerialized { 
   

								@Getter @Setter private int ip67002Ccyy;
				@Getter @Setter private Ip67002CcyyRedefined ip67002CcyyRedefined = new Ip67002CcyyRedefined();
				@Getter @Setter private Ip67002Mmdd ip67002Mmdd = new Ip67002Mmdd();
				@Getter @Setter private Ip67002Jddd ip67002Jddd = new Ip67002Jddd();
	
	/**
	* Constructor for Ip67002DateRedefined
	**/
    public Ip67002DateRedefined() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip67002DateRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002DateRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp67002CcyyRedefined().setParent(this,getStartOffset() + 0);
					getIp67002Mmdd().setParent(this,getStartOffset() + 4);
					getIp67002Jddd().setParent(this,getStartOffset() + 4);
    } 

	/**
	 * 	initializes Ip67002DateRedefined
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002Ccyy(0);
          getIp67002Mmdd().initialize();
     
   }


}
  
