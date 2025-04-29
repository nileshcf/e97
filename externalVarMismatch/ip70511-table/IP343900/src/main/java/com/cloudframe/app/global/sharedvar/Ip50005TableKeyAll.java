package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005TableKeyAll is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip50005TableKeyAll extends Ip50005TableKeyAllSerialized { 
   
				@Getter @Setter private Ip50005TableKey ip50005TableKey = new Ip50005TableKey();

								@Getter @Setter private long ip50005Seq;
	
	/**
	* Constructor for Ip50005TableKeyAll
	**/
    public Ip50005TableKeyAll() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50005TableKeyAll. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50005TableKeyAll(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp50005TableKey().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip50005TableKeyAll
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp50005TableKey().initialize();
     
                     setIp50005Seq(0);
   }


}
  
