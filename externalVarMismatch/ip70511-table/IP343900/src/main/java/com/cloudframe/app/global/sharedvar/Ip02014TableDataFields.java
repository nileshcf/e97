package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014TableDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
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
public class Ip02014TableDataFields extends Ip02014TableDataFieldsSerialized { 
   

						@Getter @Setter private char[] ip02014GeoScopeCode = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014HostInd = Field.fillLowValue(1);
				@Getter @Setter private Ip02014ImpBulkId ip02014ImpBulkId = new Ip02014ImpBulkId();

								@Getter @Setter private int ip02014NumCurrCd;

						@Getter @Setter private char[] ip02014OfsoilDataTypCd = Field.fillLowValue(3);

						@Getter @Setter private char[] ip02014MrchntSplitSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014CurrSplitSw = Field.fillLowValue(1);

								@Getter @Setter private int ip02014ClrCycleNum;

						@Getter @Setter private char[] ip02014DtaWrhsOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014BllngOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014SetlOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014ClrOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014AmsOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014McomOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014MdsOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014StndInOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014AuthOnsoilSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip02014RptHdrName = Field.fillLowValue(80);

						@Getter @Setter private char[] ip02014ClrPrcssCd = Field.fillLowValue(4);

						@Getter @Setter private char[] ip02014OnUsPrcssAgrmtId = Field.fillLowValue(11);

						@Getter @Setter private char[] ip02014OperSysId = Field.fillLowValue(20);

						@Getter @Setter private char[] ip02014DbId = Field.fillLowValue(20);
			@Getter @Setter private List<Ip02014Db2Table> ip02014Db2Table = new ArrayList<>();
    	

						@Getter @Setter private char[] ip02014Filler = Field.fillLowValue(8);
	
	/**
	* Constructor for Ip02014TableDataFields
	**/
    public Ip02014TableDataFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip02014TableDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014TableDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp02014ImpBulkId().setParent(this,getStartOffset() + 2);
				for (int arrayIndex = 0; arrayIndex < IP_02014_DB_2_TABLE_SIZE;arrayIndex++) {
						getIp02014Db2Table().add(new Ip02014Db2Table(this, beginIp02014Db2Table + 
						arrayIndex * Ip02014Db2Table.getIp02014Db2TableFieldLength()));
				}
    } 

	/**
	 * 	initializes Ip02014TableDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014GeoScopeCode(CONSTANTS.SPACE);
         setIp02014HostInd(CONSTANTS.SPACE);
          getIp02014ImpBulkId().initialize();
     
                     setIp02014NumCurrCd(0);
         setIp02014OfsoilDataTypCd(CONSTANTS.SPACE_3);
         setIp02014MrchntSplitSw(CONSTANTS.SPACE);
         setIp02014CurrSplitSw(CONSTANTS.SPACE);
                     setIp02014ClrCycleNum(0);
         setIp02014DtaWrhsOnsoilSw(CONSTANTS.SPACE);
         setIp02014BllngOnsoilSw(CONSTANTS.SPACE);
         setIp02014SetlOnsoilSw(CONSTANTS.SPACE);
         setIp02014ClrOnsoilSw(CONSTANTS.SPACE);
         setIp02014AmsOnsoilSw(CONSTANTS.SPACE);
         setIp02014McomOnsoilSw(CONSTANTS.SPACE);
         setIp02014MdsOnsoilSw(CONSTANTS.SPACE);
         setIp02014StndInOnsoilSw(CONSTANTS.SPACE);
         setIp02014AuthOnsoilSw(CONSTANTS.SPACE);
         setIp02014RptHdrName(CONSTANTS.SPACE_80);
         setIp02014ClrPrcssCd(CONSTANTS.SPACE_4);
         setIp02014OnUsPrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp02014OperSysId(CONSTANTS.SPACE_20);
         setIp02014DbId(CONSTANTS.SPACE_20);
     if (ip02014Db2Table.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_02014_DB_2_TABLE_SIZE;index++) {
              Ip02014Db2Table  newElement = new Ip02014Db2Table(this,beginIp02014Db2Table + index * Ip02014Db2Table.getIp02014Db2TableFieldLength());
              newElement.initialize();
              getIp02014Db2Table().add(newElement);
          }
     } else {
        if (ip02014Db2Table.size() < IP_02014_DB_2_TABLE_SIZE) {
          // prefill it first
          for (int index = ip02014Db2Table.size();index <  IP_02014_DB_2_TABLE_SIZE;index++) {
              Ip02014Db2Table  newElement = new Ip02014Db2Table(this,beginIp02014Db2Table + index * Ip02014Db2Table.getIp02014Db2TableFieldLength());
              getIp02014Db2Table().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_02014_DB_2_TABLE_SIZE;index++) {
     		Ip02014Db2Table ip02014Db2TableVar = ip02014Db2Table.get(index);
 			if (ip02014Db2TableVar == null) {
                ip02014Db2TableVar = new Ip02014Db2Table(this,beginIp02014Db2Table + index * Ip02014Db2Table.getIp02014Db2TableFieldLength());
                  getIp02014Db2Table().set(index, ip02014Db2TableVar);
			} 
			ip02014Db2TableVar.initialize();
		}
     }
         setIp02014Filler(CONSTANTS.SPACE_8);
   }


}
  
