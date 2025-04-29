package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004FileErrors is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip40004FileErrors extends Ip40004FileErrorsSerialized { 
   

								@Getter @Setter private int ip40004FileErrorType;
				@Getter @Setter private Ip40004FileErrorInfo ip40004FileErrorInfo = new Ip40004FileErrorInfo();
      private List<char[]> ip40004FileReplText; 

	
	/**
	* Constructor for Ip40004FileErrors
	**/
    public Ip40004FileErrors() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip40004FileErrors. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004FileErrors(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp40004FileErrorInfo().setParent(this,getStartOffset() + 2);
    } 

	/**
	 * 	initializes Ip40004FileErrors
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp40004FileErrorType(0);
          getIp40004FileErrorInfo().initialize();
     
         for (int index =0; index < IP_40004_FILE_REPL_TEXT_SIZE;index++) {
             setIp40004FileReplText(index, CONSTANTS.SPACE_50);
         }
   }


}
  
