package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02015PrcssAgrmtEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;


@Data
public class Ip02015PrcssAgrmtEntry extends Ip02015PrcssAgrmtEntrySerialized { 
   

						@Getter @Setter private char[] ip02015PrcssAgrmtId = Field.fillLowValue(11);

						@Getter @Setter private char[] ip02015GeoScopeCode = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015HostInd = Field.fillLowValue(1);
				@Getter @Setter private Ip02015ImpBulkId ip02015ImpBulkId = new Ip02015ImpBulkId();

								@Getter @Setter private int ip02015NumCurrCd;

						@Getter @Setter private char[] ip02015OfsoilDataTypCd = Field.fillLowValue(3);

						@Getter @Setter private char[] ip02015MrchntSplitSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015MrchntSplitCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015CurrSplitSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015CurrSplitCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015AcquirerSplitSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015AcquirerSplitCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015DomCollOnlyCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015OnsoilDataShrSw = Field.fillLowValue(1);

								@Getter @Setter private int ip02015ClrCycleNum;

						@Getter @Setter private char[] ip02015DtaWrhsOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015BllngOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015SetlOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015ClrOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015AmsOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015McomOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015MdsOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015StndInOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015AuthOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015RptHdrName = Field.fillLowValue(80);

						@Getter @Setter private char[] ip02015ClrPrcssCd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip02015OnUsPrcssAgrmtId = Field.fillLowValue(11);

						@Getter @Setter private char[] ip02015PushOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015IncontrolOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015EsrvcOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015GftOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015BnknetOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015MdesOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015ZappOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015CemOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02015OperSysId = Field.fillLowValue(20);

						@Getter @Setter private char[] ip02015DbId = Field.fillLowValue(20);
			@Getter @Setter private List<Ip02015Db2Table> ip02015Db2Table = new ArrayList<>();
    	

						@Getter @Setter private char[] ip02015Filler = Field.fillLowValue(390);
	
	/**
	* Constructor for Ip02015PrcssAgrmtEntry
	**/
    public Ip02015PrcssAgrmtEntry() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip02015PrcssAgrmtEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02015PrcssAgrmtEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp02015ImpBulkId().setParent(this,getStartOffset() + 13);
				for (int arrayIndex = 0; arrayIndex < IP_02015_DB_2_TABLE_SIZE;arrayIndex++) {
						getIp02015Db2Table().add(new Ip02015Db2Table(this, beginIp02015Db2Table + 
						arrayIndex * Ip02015Db2Table.getIp02015Db2TableFieldLength()));
				}
    } 

	/**
	 * 	initializes Ip02015PrcssAgrmtEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02015PrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp02015GeoScopeCode(CONSTANTS.SPACE);
         setIp02015HostInd(CONSTANTS.SPACE);
          getIp02015ImpBulkId().initialize();
     
                     setIp02015NumCurrCd(0);
         setIp02015OfsoilDataTypCd(CONSTANTS.SPACE_3);
         setIp02015MrchntSplitSw(CONSTANTS.SPACE);
         setIp02015MrchntSplitCd(CONSTANTS.SPACE);
         setIp02015CurrSplitSw(CONSTANTS.SPACE);
         setIp02015CurrSplitCd(CONSTANTS.SPACE);
         setIp02015AcquirerSplitSw(CONSTANTS.SPACE);
         setIp02015AcquirerSplitCd(CONSTANTS.SPACE);
         setIp02015DomCollOnlyCd(CONSTANTS.SPACE);
         setIp02015OnsoilDataShrSw(CONSTANTS.SPACE);
                     setIp02015ClrCycleNum(0);
         setIp02015DtaWrhsOnsoilSw(CONSTANTS.SPACE);
         setIp02015BllngOnsoilSw(CONSTANTS.SPACE);
         setIp02015SetlOnsoilSw(CONSTANTS.SPACE);
         setIp02015ClrOnsoilSw(CONSTANTS.SPACE);
         setIp02015AmsOnsoilSw(CONSTANTS.SPACE);
         setIp02015McomOnsoilSw(CONSTANTS.SPACE);
         setIp02015MdsOnsoilSw(CONSTANTS.SPACE);
         setIp02015StndInOnsoilSw(CONSTANTS.SPACE);
         setIp02015AuthOnsoilSw(CONSTANTS.SPACE);
         setIp02015RptHdrName(CONSTANTS.SPACE_80);
         setIp02015ClrPrcssCd(CONSTANTS.SPACE_4);
         setIp02015OnUsPrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp02015PushOnsoilSw(CONSTANTS.SPACE);
         setIp02015IncontrolOnsoilSw(CONSTANTS.SPACE);
         setIp02015EsrvcOnsoilSw(CONSTANTS.SPACE);
         setIp02015GftOnsoilSw(CONSTANTS.SPACE);
         setIp02015BnknetOnsoilSw(CONSTANTS.SPACE);
         setIp02015MdesOnsoilSw(CONSTANTS.SPACE);
         setIp02015ZappOnsoilSw(CONSTANTS.SPACE);
         setIp02015CemOnsoilSw(CONSTANTS.SPACE);
         setIp02015OperSysId(CONSTANTS.SPACE_20);
         setIp02015DbId(CONSTANTS.SPACE_20);
     if (ip02015Db2Table.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_02015_DB_2_TABLE_SIZE;index++) {
              Ip02015Db2Table  newElement = new Ip02015Db2Table(this,beginIp02015Db2Table + index * Ip02015Db2Table.getIp02015Db2TableFieldLength());
              newElement.initialize();
              getIp02015Db2Table().add(newElement);
          }
     } else {
        if (ip02015Db2Table.size() < IP_02015_DB_2_TABLE_SIZE) {
          // prefill it first
          for (int index = ip02015Db2Table.size();index <  IP_02015_DB_2_TABLE_SIZE;index++) {
              Ip02015Db2Table  newElement = new Ip02015Db2Table(this,beginIp02015Db2Table + index * Ip02015Db2Table.getIp02015Db2TableFieldLength());
              getIp02015Db2Table().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_02015_DB_2_TABLE_SIZE;index++) {
     		Ip02015Db2Table ip02015Db2TableVar = ip02015Db2Table.get(index);
 			if (ip02015Db2TableVar == null) {
                ip02015Db2TableVar = new Ip02015Db2Table(this,beginIp02015Db2Table + index * Ip02015Db2Table.getIp02015Db2TableFieldLength());
                  getIp02015Db2Table().set(index, ip02015Db2TableVar);
			} 
			ip02015Db2TableVar.initialize();
		}
     }
         setIp02015Filler(CONSTANTS.SPACE_390);
   }


}
  
