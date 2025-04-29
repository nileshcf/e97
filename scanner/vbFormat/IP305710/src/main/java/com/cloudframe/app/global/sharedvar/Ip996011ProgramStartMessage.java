package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip996011ProgramStartMessage is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:46. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip996011ProgramStartMessage")

@Data
public class Ip996011ProgramStartMessage extends Ip996011ProgramStartMessageSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip996011PgmId = Field.fillLowValue(8);

						@Getter @Setter private char[] ip996011Dash = Field.fillLowValue(1);

						@Getter @Setter private char[] ip996011PgmVersion = Field.fillLowValue(7);

						@Getter @Setter private char[] ip996011StartedText = Field.fillLowValue(8);
				@Getter @Setter private Ip996011StartTimestamp ip996011StartTimestamp = new Ip996011StartTimestamp();

						@Getter @Setter private char[] ip996011CompiledText = Field.fillLowValue(9);

						@Getter @Setter private char[] ip996011WhenCompiled = Field.fillLowValue(17);

						@Getter @Setter private char[] ip996011WhenCompiledX = Field.fillLowValue(17);
	
	/**
	* Constructor for Ip996011ProgramStartMessage
	**/
    public Ip996011ProgramStartMessage() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp996011StartTimestamp().setParent(this,getStartOffset() + 24);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip996011ProgramStartMessage
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp996011PgmId(CONSTANTS.SPACE_8);
         setIp996011Dash(CONSTANTS.SPACE);
         setIp996011PgmVersion(CONSTANTS.SPACE_7);
         setIp996011StartedText(CONSTANTS.SPACE_8);
          getIp996011StartTimestamp().initialize();
     
         setIp996011CompiledText(CONSTANTS.SPACE_9);
         setIp996011WhenCompiled(CONSTANTS.SPACE_17);
   }


}
  
