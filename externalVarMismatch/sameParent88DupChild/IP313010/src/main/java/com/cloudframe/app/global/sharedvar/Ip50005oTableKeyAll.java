package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005oTableKeyAll is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip50005oTableKeyAll extends Ip50005oTableKeyAllSerialized { 
   
				@Getter @Setter private Ip50005oTableKey ip50005oTableKey = new Ip50005oTableKey();

								@Getter @Setter private long ip50005oSeq;
	
	/**
	* Constructor for Ip50005oTableKeyAll
	**/
    public Ip50005oTableKeyAll() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50005oTableKeyAll. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50005oTableKeyAll(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp50005oTableKey().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip50005oTableKeyAll
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp50005oTableKey().initialize();
     
                     setIp50005oSeq(0);
   }


}
  
