package com.cloudframe.app.ip343690.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 0;
   /*  offset of each of Child Fields when serialized as a String */
	
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
     int localIsEndOfProcess100Counter = -1;
     public boolean isIsEndOfProcess100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsEndOfProcess100Counter != sharedCounter;
         localIsEndOfProcess100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsEndOfProcess100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localEofPmaCursor100Counter = -1;
     public boolean isEofPmaCursor100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEofPmaCursor100Counter != sharedCounter;
         localEofPmaCursor100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkEofPmaCursor100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsItDeadLock100Counter = -1;
     public boolean isIsItDeadLock100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsItDeadLock100Counter != sharedCounter;
         localIsItDeadLock100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsItDeadLock100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSeqNumberOpt100Counter = -1;
     public boolean isSeqNumberOpt100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeqNumberOpt100Counter != sharedCounter;
         localSeqNumberOpt100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSeqNumberOpt100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localIsItSqlError100Counter = -1;
     public boolean isIsItSqlError100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIsItSqlError100Counter != sharedCounter;
         localIsItSqlError100Counter = sharedCounter; return hasModified;
     }

   protected char[] checkIsItSqlError100Constraints(char[] value) {
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
     int localAbendCode300Counter = -1;
     public boolean isAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendCode300Counter != sharedCounter;
         localAbendCode300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
     int localAbendPara300Counter = -1;
     public boolean isAbendPara300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendPara300Counter != sharedCounter;
         localAbendPara300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendPara300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara1400300Counter = -1;
     public boolean isPara1400300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara1400300Counter != sharedCounter;
         localPara1400300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara1400300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara3210300Counter = -1;
     public boolean isPara3210300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara3210300Counter != sharedCounter;
         localPara3210300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara3210300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara3220300Counter = -1;
     public boolean isPara3220300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara3220300Counter != sharedCounter;
         localPara3220300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara3220300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara3230300Counter = -1;
     public boolean isPara3230300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara3230300Counter != sharedCounter;
         localPara3230300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara3230300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
     int localPara8100300Counter = -1;
     public boolean isPara8100300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8100300Counter != sharedCounter;
         localPara8100300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8100300Constraints(char[] value) {
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
     int localPara8210300Counter = -1;
     public boolean isPara8210300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPara8210300Counter != sharedCounter;
         localPara8210300Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPara8210300Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
         int localRecsRead400Counter = -1;
         public boolean isRecsRead400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRecsRead400Counter != sharedCounter;
            localRecsRead400Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkRecsRead400MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     int localAbendMessage600Counter = -1;
     public boolean isAbendMessage600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendMessage600Counter != sharedCounter;
         localAbendMessage600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendMessage600Constraints(char[] value) {
   			return super.checkConstraints(value , 42 ,false, false);
   }
     int localMsg3005b600Counter = -1;
     public boolean isMsg3005b600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsg3005b600Counter != sharedCounter;
         localMsg3005b600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMsg3005b600Constraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
     int localMsg3005c600Counter = -1;
     public boolean isMsg3005c600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsg3005c600Counter != sharedCounter;
         localMsg3005c600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMsg3005c600Constraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
     int localMsg3005d600Counter = -1;
     public boolean isMsg3005d600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsg3005d600Counter != sharedCounter;
         localMsg3005d600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMsg3005d600Constraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
     int localMsg3005e600Counter = -1;
     public boolean isMsg3005e600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsg3005e600Counter != sharedCounter;
         localMsg3005e600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMsg3005e600Constraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
     int localMsg3010600Counter = -1;
     public boolean isMsg3010600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsg3010600Counter != sharedCounter;
         localMsg3010600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkMsg3010600Constraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
     int localBlankSpace600Counter = -1;
     public boolean isBlankSpace600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBlankSpace600Counter != sharedCounter;
         localBlankSpace600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkBlankSpace600Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localAsteriskLine600Counter = -1;
     public boolean isAsteriskLine600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAsteriskLine600Counter != sharedCounter;
         localAsteriskLine600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAsteriskLine600Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localDb2ErrModuleMsg600Counter = -1;
     public boolean isDb2ErrModuleMsg600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb2ErrModuleMsg600Counter != sharedCounter;
         localDb2ErrModuleMsg600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDb2ErrModuleMsg600Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
     int localDb2Deadlock600Counter = -1;
     public boolean isDb2Deadlock600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb2Deadlock600Counter != sharedCounter;
         localDb2Deadlock600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDb2Deadlock600Constraints(char[] value) {
   			return super.checkConstraints(value , 63 ,false, false);
   }
     int localDb2DeadlockRel600Counter = -1;
     public boolean isDb2DeadlockRel600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb2DeadlockRel600Counter != sharedCounter;
         localDb2DeadlockRel600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkDb2DeadlockRel600Constraints(char[] value) {
   			return super.checkConstraints(value , 57 ,false, false);
   }
     int localRecsReadMsg600Counter = -1;
     public boolean isRecsReadMsg600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecsReadMsg600Counter != sharedCounter;
         localRecsReadMsg600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRecsReadMsg600Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
     int localRecsUpdatedMsg600Counter = -1;
     public boolean isRecsUpdatedMsg600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecsUpdatedMsg600Counter != sharedCounter;
         localRecsUpdatedMsg600Counter = sharedCounter; return hasModified;
     }

   protected char[] checkRecsUpdatedMsg600Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
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
     int localPtrIp599810800Counter = -1;
     public boolean isPtrIp599810800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp599810800Counter != sharedCounter;
         localPtrIp599810800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp599810800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp280010800Counter = -1;
     public boolean isPtrIp280010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp280010800Counter != sharedCounter;
         localPtrIp280010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp280010800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localPtrIp610010800Counter = -1;
     public boolean isPtrIp610010800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrIp610010800Counter != sharedCounter;
         localPtrIp610010800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrIp610010800Constraints(char[] value) {
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
     int localPtrMcwait800Counter = -1;
     public boolean isPtrMcwait800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPtrMcwait800Counter != sharedCounter;
         localPtrMcwait800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkPtrMcwait800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
         int localNoOfRows800Counter = -1;
         public boolean isNoOfRows800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNoOfRows800Counter != sharedCounter;
            localNoOfRows800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkNoOfRows800MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localCommitRows800Counter = -1;
         public boolean isCommitRows800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCommitRows800Counter != sharedCounter;
            localCommitRows800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkCommitRows800MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localActualLen800Counter = -1;
         public boolean isActualLen800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localActualLen800Counter != sharedCounter;
            localActualLen800Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkActualLen800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     int localJustifyIn800Counter = -1;
     public boolean isJustifyIn800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJustifyIn800Counter != sharedCounter;
         localJustifyIn800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkJustifyIn800Constraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
     int localJustifyOut800Counter = -1;
     public boolean isJustifyOut800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJustifyOut800Counter != sharedCounter;
         localJustifyOut800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkJustifyOut800Constraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
     int localNonSpaceFound800Counter = -1;
     public boolean isNonSpaceFound800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNonSpaceFound800Counter != sharedCounter;
         localNonSpaceFound800Counter = sharedCounter; return hasModified;
     }

   protected char[] checkNonSpaceFound800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
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
     int localDb85102cDb2BatchErrorRtnCounter = -1;
     public boolean isDb85102cDb2BatchErrorRtnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb85102cDb2BatchErrorRtnCounter != sharedCounter;
         localDb85102cDb2BatchErrorRtnCounter = sharedCounter; return hasModified;
     }

   protected char[] checkDb85102cDb2BatchErrorRtnConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localSqlTempCounter = -1;
     public boolean isSqlTempModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlTempCounter != sharedCounter;
         localSqlTempCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSqlTempConstraints(char[] value) {
   			return super.checkConstraints(value , 128 ,false, false);
   }




}
  
