package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip58041Tipapma is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip58041Tipapma")

@Data
public class Ip58041Tipapma extends Ip58041TipapmaSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip58041VirtualAccountNbr = Field.fillLowValue(19);
				@Getter @Setter private Ip58041CreateUpdateTs ip58041CreateUpdateTs = new Ip58041CreateUpdateTs();

						@Getter @Setter private char[] ip58041PrimAccountNbr = Field.fillLowValue(19);

						@Getter @Setter private char[] ip58041ActionCode = Field.fillLowValue(1);

						@Getter @Setter private char[] ip58041ObsAccessTs = Field.fillLowValue(26);

								@Getter @Setter private short ip58041ObsAccessTsN;

						@Getter @Setter private char[] ip58041EntRsnCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip58041StatCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip58041TokenTypeCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip58041PartnId = Field.fillLowValue(3);

								@Getter @Setter private long ip58041Trid;

								@Getter @Setter private short ip58041TridN;

								@Getter @Setter private short ip58041TokenAsrLvlNum;

								@Getter @Setter private short ip58041TokenAsrLvlNumN;

						@Getter @Setter private char[] ip58041Wid = Field.fillLowValue(3);

								@Getter @Setter private short ip58041WidN;

						@Getter @Setter private char[] ip58041PrimAcctSeqNum = Field.fillLowValue(3);

								@Getter @Setter private short ip58041PrimAcctSeqNumN;

						@Getter @Setter private char[] ip58041PrcssngAgrmntId = Field.fillLowValue(11);

						@Getter @Setter private char[] ip58041MqSentSw = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip58041Tipapma
	**/
    public Ip58041Tipapma() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp58041CreateUpdateTs().setParent(this,getStartOffset() + 19);
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip58041Tipapma
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp58041VirtualAccountNbr(CONSTANTS.SPACE_19);
          getIp58041CreateUpdateTs().initialize();
     
         setIp58041PrimAccountNbr(CONSTANTS.SPACE_19);
         setIp58041ActionCode(CONSTANTS.SPACE);
         setIp58041ObsAccessTs(CONSTANTS.SPACE_26);
         	setIp58041ObsAccessTsN((short)0);
         setIp58041EntRsnCd(CONSTANTS.SPACE);
         setIp58041StatCd(CONSTANTS.SPACE);
         setIp58041TokenTypeCd(CONSTANTS.SPACE);
         setIp58041PartnId(CONSTANTS.SPACE_3);
                     setIp58041Trid(0);
         	setIp58041TridN((short)0);
         	setIp58041TokenAsrLvlNum((short)0);
         	setIp58041TokenAsrLvlNumN((short)0);
         setIp58041Wid(CONSTANTS.SPACE_3);
         	setIp58041WidN((short)0);
         setIp58041PrimAcctSeqNum(CONSTANTS.SPACE_3);
         	setIp58041PrimAcctSeqNumN((short)0);
         setIp58041PrcssngAgrmntId(CONSTANTS.SPACE_11);
         setIp58041MqSentSw(CONSTANTS.SPACE);
   }


}
  
