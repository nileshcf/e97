package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005oTableKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip50005oTableKey extends Ip50005oTableKeySerialized { 
   
				@Getter @Setter private Ip50005oTableId ip50005oTableId = new Ip50005oTableId();

						@Getter @Setter private char[] ip50005oReadTableId = Field.fillLowValue(8);

								@Getter @Setter private long ip50005oEffDate;
	
	/**
	* Constructor for Ip50005oTableKey
	**/
    public Ip50005oTableKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50005oTableKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50005oTableKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp50005oTableId().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip50005oTableKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp50005oTableId().initialize();
     
                     setIp50005oEffDate(0);
   }


}
  
