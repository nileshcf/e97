package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01FrozenChillSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01FrozenChillSegData extends Bdms01FrozenChillSegDataSerialized { 
   

								@Getter @Setter private int bdms01FrozenChillSegSqlcd;

								@Getter @Setter private long msdFrozenChilledInd;
				@Getter @Setter private MsdFrozenChilledIndR msdFrozenChilledIndR = new MsdFrozenChilledIndR();
			@Getter @Setter private List<MsdFcData> msdFcData = new ArrayList<>();
    	

						@Getter @Setter private char[] msdDtc = Field.fillLowValue(1);

						@Getter @Setter private char[] msdDtcCustodyInd = Field.fillLowValue(1);

	
	/**
	* Constructor for Bdms01FrozenChillSegData
	**/
    public Bdms01FrozenChillSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01FrozenChillSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01FrozenChillSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMsdFrozenChilledIndR().setParent(this,getStartOffset() + 4);
				for (int arrayIndex = 0; arrayIndex < MSD_FC_DATA_SIZE;arrayIndex++) {
						getMsdFcData().add(new MsdFcData(this, beginMsdFcData + 
						arrayIndex * MsdFcData.getMsdFcDataFieldLength()));
				}
    } 

	/**
	 * 	initializes Bdms01FrozenChillSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01FrozenChillSegSqlcd(0);
                     setMsdFrozenChilledInd(0);
     if (msdFcData.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  MSD_FC_DATA_SIZE;index++) {
              MsdFcData  newElement = new MsdFcData(this,beginMsdFcData + index * MsdFcData.getMsdFcDataFieldLength());
              newElement.initialize();
              getMsdFcData().add(newElement);
          }
     } else {
        if (msdFcData.size() < MSD_FC_DATA_SIZE) {
          // prefill it first
          for (int index = msdFcData.size();index <  MSD_FC_DATA_SIZE;index++) {
              MsdFcData  newElement = new MsdFcData(this,beginMsdFcData + index * MsdFcData.getMsdFcDataFieldLength());
              getMsdFcData().add(newElement);
          }
        }
        
     	for (int index = 0;index <  MSD_FC_DATA_SIZE;index++) {
     		MsdFcData msdFcDataVar = msdFcData.get(index);
 			if (msdFcDataVar == null) {
                msdFcDataVar = new MsdFcData(this,beginMsdFcData + index * MsdFcData.getMsdFcDataFieldLength());
                  getMsdFcData().set(index, msdFcDataVar);
			} 
			msdFcDataVar.initialize();
		}
     }
         setMsdDtc(CONSTANTS.SPACE);
         setMsdDtcCustodyInd(CONSTANTS.SPACE);
   }


}
  
