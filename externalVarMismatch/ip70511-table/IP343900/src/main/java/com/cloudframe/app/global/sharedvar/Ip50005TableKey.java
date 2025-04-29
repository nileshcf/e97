package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005TableKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip50005TableKey extends Ip50005TableKeySerialized { 
   
				@Getter @Setter private Ip50005TableId ip50005TableId = new Ip50005TableId();

						@Getter @Setter private char[] ip50005ReadTableId = Field.fillLowValue(8);

								@Getter @Setter private long ip50005EffDate;
	
	/**
	* Constructor for Ip50005TableKey
	**/
    public Ip50005TableKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50005TableKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50005TableKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp50005TableId().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip50005TableKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp50005TableId().initialize();
     
                     setIp50005EffDate(0);
   }


}
  
