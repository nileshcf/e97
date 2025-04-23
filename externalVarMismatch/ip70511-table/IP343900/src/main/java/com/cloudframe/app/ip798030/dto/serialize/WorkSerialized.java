package com.cloudframe.app.ip798030.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCyclId99800;
            protected  int beginCyclId6800;
            protected  int beginCyclId7800;
            protected  int beginPimLen800;
            protected  int beginStartQ800;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginCyclId99800 = getStartOffset() + 0;	// set offset for serialization
  
             beginCyclId6800 = getStartOffset() + 2;	// set offset for serialization
  
             beginCyclId7800 = getStartOffset() + 4;	// set offset for serialization
  
  
  
  
             beginPimLen800 = getStartOffset() + 6;	// set offset for serialization
  
  
  
             beginStartQ800 = getStartOffset() + 9;	// set offset for serialization
  
  
  
  
	   /*  end of offset */
	}
     int localIsItTheFirstTime100Counter = -1;
     public boolean isIsItTheFirstTime100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsItTheFirstTime100Counter != sharedCounter;
         localIsItTheFirstTime100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsItTheFirstTime100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localRemoteProcessingSwitch100Counter = -1;
     public boolean isRemoteProcessingSwitch100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRemoteProcessingSwitch100Counter != sharedCounter;
         localRemoteProcessingSwitch100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRemoteProcessingSwitch100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIs1stLrmSwitch100Counter = -1;
     public boolean isIs1stLrmSwitch100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIs1stLrmSwitch100Counter != sharedCounter;
         localIs1stLrmSwitch100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIs1stLrmSwitch100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localTableRows100Counter = -1;
     public boolean isTableRows100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableRows100Counter != sharedCounter;
         localTableRows100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTableRows100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsRecordEligible100Counter = -1;
     public boolean isIsRecordEligible100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsRecordEligible100Counter != sharedCounter;
         localIsRecordEligible100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsRecordEligible100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localMqRespStatusSw100Counter = -1;
     public boolean isMqRespStatusSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqRespStatusSw100Counter != sharedCounter;
         localMqRespStatusSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMqRespStatusSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localMqStatusSw100Counter = -1;
     public boolean isMqStatusSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqStatusSw100Counter != sharedCounter;
         localMqStatusSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMqStatusSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsSys202OpenSw100Counter = -1;
     public boolean isIsSys202OpenSw100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsSys202OpenSw100Counter != sharedCounter;
         localIsSys202OpenSw100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsSys202OpenSw100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsEndProcess100Counter = -1;
     public boolean isIsEndProcess100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsEndProcess100Counter != sharedCounter;
         localIsEndProcess100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsEndProcess100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSys001FileStatus200Counter = -1;
     public boolean isSys001FileStatus200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001FileStatus200Counter != sharedCounter;
         localSys001FileStatus200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys001FileStatus200Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localSys202FileStatus200Counter = -1;
     public boolean isSys202FileStatus200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys202FileStatus200Counter != sharedCounter;
         localSys202FileStatus200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys202FileStatus200Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localSys210FileStatus200Counter = -1;
     public boolean isSys210FileStatus200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys210FileStatus200Counter != sharedCounter;
         localSys210FileStatus200Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys210FileStatus200Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localPgmIp081050300Counter = -1;
     public boolean isPgmIp081050300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp081050300Counter != sharedCounter;
         localPgmIp081050300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp081050300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp081110300Counter = -1;
     public boolean isPgmIp081110300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp081110300Counter != sharedCounter;
         localPgmIp081110300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp081110300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp081190300Counter = -1;
     public boolean isPgmIp081190300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp081190300Counter != sharedCounter;
         localPgmIp081190300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp081190300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp282210300Counter = -1;
     public boolean isPgmIp282210300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp282210300Counter != sharedCounter;
         localPgmIp282210300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp282210300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp282240300Counter = -1;
     public boolean isPgmIp282240300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp282240300Counter != sharedCounter;
         localPgmIp282240300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp282240300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp500920300Counter = -1;
     public boolean isPgmIp500920300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp500920300Counter != sharedCounter;
         localPgmIp500920300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp500920300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp532010300Counter = -1;
     public boolean isPgmIp532010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp532010300Counter != sharedCounter;
         localPgmIp532010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp532010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp532110300Counter = -1;
     public boolean isPgmIp532110300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp532110300Counter != sharedCounter;
         localPgmIp532110300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp532110300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp534110300Counter = -1;
     public boolean isPgmIp534110300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp534110300Counter != sharedCounter;
         localPgmIp534110300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp534110300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp595010300Counter = -1;
     public boolean isPgmIp595010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp595010300Counter != sharedCounter;
         localPgmIp595010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp595010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp599050300Counter = -1;
     public boolean isPgmIp599050300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp599050300Counter != sharedCounter;
         localPgmIp599050300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp599050300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp599810300Counter = -1;
     public boolean isPgmIp599810300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp599810300Counter != sharedCounter;
         localPgmIp599810300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp599810300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp610010300Counter = -1;
     public boolean isPgmIp610010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp610010300Counter != sharedCounter;
         localPgmIp610010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp610010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp648010300Counter = -1;
     public boolean isPgmIp648010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp648010300Counter != sharedCounter;
         localPgmIp648010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp648010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp670010300Counter = -1;
     public boolean isPgmIp670010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp670010300Counter != sharedCounter;
         localPgmIp670010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp670010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp699910300Counter = -1;
     public boolean isPgmIp699910300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp699910300Counter != sharedCounter;
         localPgmIp699910300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp699910300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp699930300Counter = -1;
     public boolean isPgmIp699930300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp699930300Counter != sharedCounter;
         localPgmIp699930300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp699930300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp760010300Counter = -1;
     public boolean isPgmIp760010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp760010300Counter != sharedCounter;
         localPgmIp760010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp760010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp798030300Counter = -1;
     public boolean isPgmIp798030300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp798030300Counter != sharedCounter;
         localPgmIp798030300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp798030300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp996010300Counter = -1;
     public boolean isPgmIp996010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp996010300Counter != sharedCounter;
         localPgmIp996010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp996010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp750080300Counter = -1;
     public boolean isPgmIp750080300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp750080300Counter != sharedCounter;
         localPgmIp750080300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp750080300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp703020300Counter = -1;
     public boolean isPgmIp703020300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp703020300Counter != sharedCounter;
         localPgmIp703020300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp703020300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp708020300Counter = -1;
     public boolean isPgmIp708020300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp708020300Counter != sharedCounter;
         localPgmIp708020300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp708020300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmIp996020300Counter = -1;
     public boolean isPgmIp996020300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp996020300Counter != sharedCounter;
         localPgmIp996020300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmIp996020300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPgmVersion300Counter = -1;
     public boolean isPgmVersion300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmVersion300Counter != sharedCounter;
         localPgmVersion300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPgmVersion300Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
         int localValue1300Counter = -1;
         public boolean isValue1300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localValue1300Counter != sharedCounter;
            localValue1300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkValue1300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localValue2300Counter = -1;
         public boolean isValue2300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localValue2300Counter != sharedCounter;
            localValue2300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkValue2300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localValue3300Counter = -1;
         public boolean isValue3300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localValue3300Counter != sharedCounter;
            localValue3300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkValue3300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localValue4300Counter = -1;
         public boolean isValue4300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localValue4300Counter != sharedCounter;
            localValue4300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkValue4300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localValue5300Counter = -1;
         public boolean isValue5300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localValue5300Counter != sharedCounter;
            localValue5300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkValue5300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localValue17300Counter = -1;
         public boolean isValue17300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localValue17300Counter != sharedCounter;
            localValue17300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkValue17300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localValue18300Counter = -1;
         public boolean isValue18300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localValue18300Counter != sharedCounter;
            localValue18300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkValue18300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localValueR300Counter = -1;
     public boolean isValueR300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueR300Counter != sharedCounter;
         localValueR300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueR300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localClearingApplicationId300Counter = -1;
     public boolean isClearingApplicationId300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClearingApplicationId300Counter != sharedCounter;
         localClearingApplicationId300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkClearingApplicationId300Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localValuePim300Counter = -1;
     public boolean isValuePim300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValuePim300Counter != sharedCounter;
         localValuePim300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValuePim300Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
     int localValueZos300Counter = -1;
     public boolean isValueZos300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueZos300Counter != sharedCounter;
         localValueZos300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueZos300Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
     int localValueLinux300Counter = -1;
     public boolean isValueLinux300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueLinux300Counter != sharedCounter;
         localValueLinux300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueLinux300Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
     int localValueLprus300Counter = -1;
     public boolean isValueLprus300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueLprus300Counter != sharedCounter;
         localValueLprus300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueLprus300Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
     int localValueRpnspk300Counter = -1;
     public boolean isValueRpnspk300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValueRpnspk300Counter != sharedCounter;
         localValueRpnspk300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkValueRpnspk300Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
         int localMqFailCode300Counter = -1;
         public boolean isMqFailCode300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqFailCode300Counter != sharedCounter;
            localMqFailCode300Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMqFailCode300MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localDdSys202300Counter = -1;
     public boolean isDdSys202300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDdSys202300Counter != sharedCounter;
         localDdSys202300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDdSys202300Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localPara1300300Counter = -1;
     public boolean isPara1300300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1300300Counter != sharedCounter;
         localPara1300300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1300300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara1510300Counter = -1;
     public boolean isPara1510300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1510300Counter != sharedCounter;
         localPara1510300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1510300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara1520300Counter = -1;
     public boolean isPara1520300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1520300Counter != sharedCounter;
         localPara1520300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1520300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara1800300Counter = -1;
     public boolean isPara1800300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1800300Counter != sharedCounter;
         localPara1800300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1800300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara1950300Counter = -1;
     public boolean isPara1950300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1950300Counter != sharedCounter;
         localPara1950300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1950300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara2112300Counter = -1;
     public boolean isPara2112300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2112300Counter != sharedCounter;
         localPara2112300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2112300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara2113300Counter = -1;
     public boolean isPara2113300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2113300Counter != sharedCounter;
         localPara2113300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2113300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara2210300Counter = -1;
     public boolean isPara2210300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2210300Counter != sharedCounter;
         localPara2210300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2210300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara2211300Counter = -1;
     public boolean isPara2211300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2211300Counter != sharedCounter;
         localPara2211300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2211300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara2221300Counter = -1;
     public boolean isPara2221300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2221300Counter != sharedCounter;
         localPara2221300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2221300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara2213300Counter = -1;
     public boolean isPara2213300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2213300Counter != sharedCounter;
         localPara2213300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2213300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara2310300Counter = -1;
     public boolean isPara2310300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2310300Counter != sharedCounter;
         localPara2310300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2310300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara2700300Counter = -1;
     public boolean isPara2700300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara2700300Counter != sharedCounter;
         localPara2700300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara2700300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara4100300Counter = -1;
     public boolean isPara4100300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara4100300Counter != sharedCounter;
         localPara4100300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara4100300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara4200300Counter = -1;
     public boolean isPara4200300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara4200300Counter != sharedCounter;
         localPara4200300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara4200300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara4500300Counter = -1;
     public boolean isPara4500300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara4500300Counter != sharedCounter;
         localPara4500300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara4500300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara5000300Counter = -1;
     public boolean isPara5000300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara5000300Counter != sharedCounter;
         localPara5000300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara5000300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8200300Counter = -1;
     public boolean isPara8200300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8200300Counter != sharedCounter;
         localPara8200300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8200300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8300300Counter = -1;
     public boolean isPara8300300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8300300Counter != sharedCounter;
         localPara8300300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8300300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8400300Counter = -1;
     public boolean isPara8400300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8400300Counter != sharedCounter;
         localPara8400300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8400300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8420300Counter = -1;
     public boolean isPara8420300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8420300Counter != sharedCounter;
         localPara8420300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8420300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8430300Counter = -1;
     public boolean isPara8430300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8430300Counter != sharedCounter;
         localPara8430300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8430300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8500300Counter = -1;
     public boolean isPara8500300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8500300Counter != sharedCounter;
         localPara8500300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8500300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8900300Counter = -1;
     public boolean isPara8900300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8900300Counter != sharedCounter;
         localPara8900300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8900300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localOpenAbendCode300Counter = -1;
     public boolean isOpenAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOpenAbendCode300Counter != sharedCounter;
         localOpenAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOpenAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localReadAbendCode300Counter = -1;
     public boolean isReadAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReadAbendCode300Counter != sharedCounter;
         localReadAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkReadAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localCloseAbendCode300Counter = -1;
     public boolean isCloseAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCloseAbendCode300Counter != sharedCounter;
         localCloseAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCloseAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localMcdynamAbendCode300Counter = -1;
     public boolean isMcdynamAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcdynamAbendCode300Counter != sharedCounter;
         localMcdynamAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMcdynamAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localGetClrDtTmAbendCode300Counter = -1;
     public boolean isGetClrDtTmAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGetClrDtTmAbendCode300Counter != sharedCounter;
         localGetClrDtTmAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkGetClrDtTmAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localJobgrpNoErrAbendCode300Counter = -1;
     public boolean isJobgrpNoErrAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJobgrpNoErrAbendCode300Counter != sharedCounter;
         localJobgrpNoErrAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkJobgrpNoErrAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localWriteAbendCode300Counter = -1;
     public boolean isWriteAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWriteAbendCode300Counter != sharedCounter;
         localWriteAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWriteAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localInvalidRcIp648010300Counter = -1;
     public boolean isInvalidRcIp648010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInvalidRcIp648010300Counter != sharedCounter;
         localInvalidRcIp648010300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkInvalidRcIp648010300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localIp699930ErrAbendCode300Counter = -1;
     public boolean isIp699930ErrAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp699930ErrAbendCode300Counter != sharedCounter;
         localIp699930ErrAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIp699930ErrAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localMqErrAbendCode300Counter = -1;
     public boolean isMqErrAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqErrAbendCode300Counter != sharedCounter;
         localMqErrAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMqErrAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
         int localSys202Count400Counter = -1;
         public boolean isSys202Count400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSys202Count400Counter != sharedCounter;
            localSys202Count400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSys202Count400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTamapmaRowsFetched400Counter = -1;
         public boolean isTamapmaRowsFetched400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTamapmaRowsFetched400Counter != sharedCounter;
            localTamapmaRowsFetched400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTamapmaRowsFetched400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTamapmaRowsDeleted400Counter = -1;
         public boolean isTamapmaRowsDeleted400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTamapmaRowsDeleted400Counter != sharedCounter;
            localTamapmaRowsDeleted400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTamapmaRowsDeleted400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTipapimRowsInserted400Counter = -1;
         public boolean isTipapimRowsInserted400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTipapimRowsInserted400Counter != sharedCounter;
            localTipapimRowsInserted400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTipapimRowsInserted400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTipapimRowsReplaced400Counter = -1;
         public boolean isTipapimRowsReplaced400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTipapimRowsReplaced400Counter != sharedCounter;
            localTipapimRowsReplaced400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTipapimRowsReplaced400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localTipapimRowsFetched400Counter = -1;
         public boolean isTipapimRowsFetched400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTipapimRowsFetched400Counter != sharedCounter;
            localTipapimRowsFetched400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkTipapimRowsFetched400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localPimCommitCnt400Counter = -1;
         public boolean isPimCommitCnt400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPimCommitCnt400Counter != sharedCounter;
            localPimCommitCnt400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkPimCommitCnt400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localPmaDeleteCnt400Counter = -1;
         public boolean isPmaDeleteCnt400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPmaDeleteCnt400Counter != sharedCounter;
            localPmaDeleteCnt400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkPmaDeleteCnt400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localMqPimRec400Counter = -1;
         public boolean isMqPimRec400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqPimRec400Counter != sharedCounter;
            localMqPimRec400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMqPimRec400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localMqInvRec400Counter = -1;
         public boolean isMqInvRec400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqInvRec400Counter != sharedCounter;
            localMqInvRec400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMqInvRec400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localMqPimInsert400Counter = -1;
         public boolean isMqPimInsert400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMqPimInsert400Counter != sharedCounter;
            localMqPimInsert400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkMqPimInsert400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localNoOfValidTrans400Counter = -1;
         public boolean isNoOfValidTrans400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNoOfValidTrans400Counter != sharedCounter;
            localNoOfValidTrans400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkNoOfValidTrans400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localMqGetErrorMsgTxt614Counter = -1;
     public boolean isMqGetErrorMsgTxt614Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMqGetErrorMsgTxt614Counter != sharedCounter;
         localMqGetErrorMsgTxt614Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMqGetErrorMsgTxt614Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
     int localClrCyclNotFoundMsgTxt660Counter = -1;
     public boolean isClrCyclNotFoundMsgTxt660Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClrCyclNotFoundMsgTxt660Counter != sharedCounter;
         localClrCyclNotFoundMsgTxt660Counter = sharedCounter; return hasModified;
     }

   protected char[] checkClrCyclNotFoundMsgTxt660Constraints(char[] value) {
   			return super.checkConstraints(value , 43 ,false, false);
   }
     int localTipackpMsgTxt680Counter = -1;
     public boolean isTipackpMsgTxt680Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTipackpMsgTxt680Counter != sharedCounter;
         localTipackpMsgTxt680Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTipackpMsgTxt680Constraints(char[] value) {
   			return super.checkConstraints(value , 48 ,false, false);
   }
     int localInvalidParmMsgTxt696Counter = -1;
     public boolean isInvalidParmMsgTxt696Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInvalidParmMsgTxt696Counter != sharedCounter;
         localInvalidParmMsgTxt696Counter = sharedCounter; return hasModified;
     }

   protected char[] checkInvalidParmMsgTxt696Constraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
     int localAbendPtr800Counter = -1;
     public boolean isAbendPtr800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendPtr800Counter != sharedCounter;
         localAbendPtr800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendPtr800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp081050800Counter = -1;
     public boolean isPtrIp081050800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp081050800Counter != sharedCounter;
         localPtrIp081050800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp081050800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp081110800Counter = -1;
     public boolean isPtrIp081110800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp081110800Counter != sharedCounter;
         localPtrIp081110800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp081110800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp081190800Counter = -1;
     public boolean isPtrIp081190800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp081190800Counter != sharedCounter;
         localPtrIp081190800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp081190800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp282210800Counter = -1;
     public boolean isPtrIp282210800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp282210800Counter != sharedCounter;
         localPtrIp282210800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp282210800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp282240800Counter = -1;
     public boolean isPtrIp282240800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp282240800Counter != sharedCounter;
         localPtrIp282240800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp282240800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp500920800Counter = -1;
     public boolean isPtrIp500920800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp500920800Counter != sharedCounter;
         localPtrIp500920800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp500920800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp532010800Counter = -1;
     public boolean isPtrIp532010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp532010800Counter != sharedCounter;
         localPtrIp532010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp532010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp532110800Counter = -1;
     public boolean isPtrIp532110800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp532110800Counter != sharedCounter;
         localPtrIp532110800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp532110800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp534110800Counter = -1;
     public boolean isPtrIp534110800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp534110800Counter != sharedCounter;
         localPtrIp534110800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp534110800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp595010800Counter = -1;
     public boolean isPtrIp595010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp595010800Counter != sharedCounter;
         localPtrIp595010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp595010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp599050800Counter = -1;
     public boolean isPtrIp599050800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp599050800Counter != sharedCounter;
         localPtrIp599050800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp599050800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp599810800Counter = -1;
     public boolean isPtrIp599810800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp599810800Counter != sharedCounter;
         localPtrIp599810800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp599810800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp648010800Counter = -1;
     public boolean isPtrIp648010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp648010800Counter != sharedCounter;
         localPtrIp648010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp648010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp670010800Counter = -1;
     public boolean isPtrIp670010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp670010800Counter != sharedCounter;
         localPtrIp670010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp670010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp699910800Counter = -1;
     public boolean isPtrIp699910800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp699910800Counter != sharedCounter;
         localPtrIp699910800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp699910800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp699930800Counter = -1;
     public boolean isPtrIp699930800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp699930800Counter != sharedCounter;
         localPtrIp699930800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp699930800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp760010800Counter = -1;
     public boolean isPtrIp760010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp760010800Counter != sharedCounter;
         localPtrIp760010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp760010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp996010800Counter = -1;
     public boolean isPtrIp996010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp996010800Counter != sharedCounter;
         localPtrIp996010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp996010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp750080800Counter = -1;
     public boolean isPtrIp750080800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp750080800Counter != sharedCounter;
         localPtrIp750080800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp750080800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp703020800Counter = -1;
     public boolean isPtrIp703020800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp703020800Counter != sharedCounter;
         localPtrIp703020800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp703020800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp708020800Counter = -1;
     public boolean isPtrIp708020800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp708020800Counter != sharedCounter;
         localPtrIp708020800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp708020800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp996020800Counter = -1;
     public boolean isPtrIp996020800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp996020800Counter != sharedCounter;
         localPtrIp996020800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp996020800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localCutoffPimPrev800Counter = -1;
     public boolean isCutoffPimPrev800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCutoffPimPrev800Counter != sharedCounter;
         localCutoffPimPrev800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCutoffPimPrev800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
     int localCreateUpdateTs800Counter = -1;
     public boolean isCreateUpdateTs800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCreateUpdateTs800Counter != sharedCounter;
         localCreateUpdateTs800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCreateUpdateTs800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
     int localObsAccessTs800Counter = -1;
     public boolean isObsAccessTs800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localObsAccessTs800Counter != sharedCounter;
         localObsAccessTs800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkObsAccessTs800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
     int localFileName800Counter = -1;
     public boolean isFileName800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileName800Counter != sharedCounter;
         localFileName800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkFileName800Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localCyclId99800Counter = -1;
     public boolean isCyclId99800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCyclId99800Counter != sharedCounter;
         localCyclId99800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cyclId99800
	 *	@return cyclId99800
	 */
	public char[]  getCyclId99800String() {
	     return getCharArray(beginCyclId99800,CYCL_ID_99800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cyclId99800IsNumeric() {
	    return isNumeric(beginCyclId99800
	                    ,beginCyclId99800 + CYCL_ID_99800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CYCL_ID_99800_LEN = 2;
  	/**
	 * serializeCyclId99800
	 */
	protected void serializeCyclId99800(int cyclId99800) {
		 putNumber(beginCyclId99800,cyclId99800,CYCL_ID_99800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCyclId99800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCyclId99800
	 */
   	protected  int serializeCyclId99800(char[] value) {
	    int  cyclId99800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cyclId99800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCyclId99800
		       ,2
		      );
		 localCyclId99800Counter = shareString.getSerializedField().getModifiedCounter();
		return  cyclId99800;
    }

   protected int checkCyclId99800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCyclId99800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCyclId99800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCyclId99800
			                 ,CYCL_ID_99800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cyclId99800", beginCyclId99800,CYCL_ID_99800_LEN);
    }
   	}
     int localCyclId6800Counter = -1;
     public boolean isCyclId6800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCyclId6800Counter != sharedCounter;
         localCyclId6800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cyclId6800
	 *	@return cyclId6800
	 */
	public char[]  getCyclId6800String() {
	     return getCharArray(beginCyclId6800,CYCL_ID_6800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cyclId6800IsNumeric() {
	    return isNumeric(beginCyclId6800
	                    ,beginCyclId6800 + CYCL_ID_6800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CYCL_ID_6800_LEN = 2;
  	/**
	 * serializeCyclId6800
	 */
	protected void serializeCyclId6800(int cyclId6800) {
		 putNumber(beginCyclId6800,cyclId6800,CYCL_ID_6800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCyclId6800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCyclId6800
	 */
   	protected  int serializeCyclId6800(char[] value) {
	    int  cyclId6800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cyclId6800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCyclId6800
		       ,2
		      );
		 localCyclId6800Counter = shareString.getSerializedField().getModifiedCounter();
		return  cyclId6800;
    }

   protected int checkCyclId6800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCyclId6800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCyclId6800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCyclId6800
			                 ,CYCL_ID_6800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cyclId6800", beginCyclId6800,CYCL_ID_6800_LEN);
    }
   	}
     int localCyclId7800Counter = -1;
     public boolean isCyclId7800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCyclId7800Counter != sharedCounter;
         localCyclId7800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cyclId7800
	 *	@return cyclId7800
	 */
	public char[]  getCyclId7800String() {
	     return getCharArray(beginCyclId7800,CYCL_ID_7800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cyclId7800IsNumeric() {
	    return isNumeric(beginCyclId7800
	                    ,beginCyclId7800 + CYCL_ID_7800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CYCL_ID_7800_LEN = 2;
  	/**
	 * serializeCyclId7800
	 */
	protected void serializeCyclId7800(int cyclId7800) {
		 putNumber(beginCyclId7800,cyclId7800,CYCL_ID_7800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCyclId7800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCyclId7800
	 */
   	protected  int serializeCyclId7800(char[] value) {
	    int  cyclId7800;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cyclId7800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginCyclId7800
		       ,2
		      );
		 localCyclId7800Counter = shareString.getSerializedField().getModifiedCounter();
		return  cyclId7800;
    }

   protected int checkCyclId7800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCyclId7800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCyclId7800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCyclId7800
			                 ,CYCL_ID_7800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cyclId7800", beginCyclId7800,CYCL_ID_7800_LEN);
    }
   	}
     int localOutputDsn800Counter = -1;
     public boolean isOutputDsn800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutputDsn800Counter != sharedCounter;
         localOutputDsn800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkOutputDsn800Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
     int localSys202Dsn800Counter = -1;
     public boolean isSys202Dsn800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys202Dsn800Counter != sharedCounter;
         localSys202Dsn800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSys202Dsn800Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
     int localCutoffPimTmpTs800Counter = -1;
     public boolean isCutoffPimTmpTs800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCutoffPimTmpTs800Counter != sharedCounter;
         localCutoffPimTmpTs800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkCutoffPimTmpTs800Constraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
     int localPimLen800Counter = -1;
     public boolean isPimLen800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPimLen800Counter != sharedCounter;
         localPimLen800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of pimLen800
	 *	@return pimLen800
	 */
	public char[]  getPimLen800String() {
	     return getCharArray(beginPimLen800,PIM_LEN_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pimLen800IsNumeric() {
	    return isNumeric(beginPimLen800
	                    ,beginPimLen800 + PIM_LEN_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PIM_LEN_800_LEN = 3;
  	/**
	 * serializePimLen800
	 */
	protected void serializePimLen800(int pimLen800) {
		 putNumber(beginPimLen800,pimLen800,PIM_LEN_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPimLen800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePimLen800
	 */
   	protected  int serializePimLen800(char[] value) {
	    int  pimLen800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    pimLen800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginPimLen800
		       ,3
		      );
		 localPimLen800Counter = shareString.getSerializedField().getModifiedCounter();
		return  pimLen800;
    }

   protected int checkPimLen800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPimLen800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPimLen800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPimLen800
			                 ,PIM_LEN_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("pimLen800", beginPimLen800,PIM_LEN_800_LEN);
    }
   	}
     int localTableId800Counter = -1;
     public boolean isTableId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTableId800Counter != sharedCounter;
         localTableId800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkTableId800Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
     int localPimBulkFileTypeCd800Counter = -1;
     public boolean isPimBulkFileTypeCd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPimBulkFileTypeCd800Counter != sharedCounter;
         localPimBulkFileTypeCd800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPimBulkFileTypeCd800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localStartQ800Counter = -1;
     public boolean isStartQ800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStartQ800Counter != sharedCounter;
         localStartQ800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of startQ800
	 *	@return startQ800
	 */
	public char[]  getStartQ800String() {
	     return getCharArray(beginStartQ800,START_Q_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean startQ800IsNumeric() {
	    return isNumeric(beginStartQ800
	                    ,beginStartQ800 + START_Q_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int START_Q_800_LEN = 6;
  	/**
	 * serializeStartQ800
	 */
	protected void serializeStartQ800(long startQ800) {
		 putNumber(beginStartQ800,startQ800,START_Q_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localStartQ800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeStartQ800
	 */
   	protected  long serializeStartQ800(char[] value) {
	    long  startQ800;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    startQ800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginStartQ800
		       ,6
		      );
		 localStartQ800Counter = shareString.getSerializedField().getModifiedCounter();
		return  startQ800;
    }

   protected long checkStartQ800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshStartQ800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshStartQ800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginStartQ800
			                 ,START_Q_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("startQ800", beginStartQ800,START_Q_800_LEN);
    }
   	}
     int localAstriskLine900Counter = -1;
     public boolean isAstriskLine900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAstriskLine900Counter != sharedCounter;
         localAstriskLine900Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAstriskLine900Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
     int localAbendAbend900Counter = -1;
     public boolean isAbendAbend900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendAbend900Counter != sharedCounter;
         localAbendAbend900Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendAbend900Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
     int localAbendAbendPgm900Counter = -1;
     public boolean isAbendAbendPgm900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendAbendPgm900Counter != sharedCounter;
         localAbendAbendPgm900Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendAbendPgm900Constraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }




}
  
