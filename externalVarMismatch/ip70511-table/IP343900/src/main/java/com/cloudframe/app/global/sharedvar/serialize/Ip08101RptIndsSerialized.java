package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip08101RptIndsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip08101RptIndsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip08101RptIndsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_08101_RPT_INDS_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp08101ThreshProcOpt;
            protected  int beginIp08101RunIndicator;
            protected  int beginIp08101RerunOption;
            protected  int beginIp08101LocationInd;
            protected  int beginIp08101CreErrDetCoRpt;
            protected  int beginIp08101CreErrDetIpRpt;
            protected  int beginIp08101CreErrDetInstId;
            protected  int beginIp08101CreErrDetInstAcpt;
            protected  int beginIp08101CreErrSumInstId;
            protected  int beginIp08101CreErrSumTrans;
            protected  int beginIp08101CreFinFileDet;
            protected  int beginIp08101CreFinFileTot;
            protected  int beginIp08101CreFinTransTot;
            protected  int beginIp08101CreFinRunTot;
            protected  int beginIp08101CreThreshSum;
	
	/**
	* Constructor for Ip08101RptIndsSerialized
	**/
    public Ip08101RptIndsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip08101RptIndsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip08101RptIndsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip08101RptIndsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,9); // serialize this field at offset 9 by default 
    }
    
	/**
	* sets parent for this Ip08101RptIndsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 9 by default
    }    
	/**
	* initializes the field in Ip08101RptIndsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_08101_RPT_INDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp08101ThreshProcOpt = getStartOffset() + 0;	// set offset for serialization
  
             beginIp08101RunIndicator = getStartOffset() + 1;	// set offset for serialization
  
             beginIp08101RerunOption = getStartOffset() + 2;	// set offset for serialization
  
             beginIp08101LocationInd = getStartOffset() + 3;	// set offset for serialization
  
             beginIp08101CreErrDetCoRpt = getStartOffset() + 4;	// set offset for serialization
  
             beginIp08101CreErrDetIpRpt = getStartOffset() + 5;	// set offset for serialization
  
             beginIp08101CreErrDetInstId = getStartOffset() + 6;	// set offset for serialization
  
             beginIp08101CreErrDetInstAcpt = getStartOffset() + 7;	// set offset for serialization
  
             beginIp08101CreErrSumInstId = getStartOffset() + 8;	// set offset for serialization
  
             beginIp08101CreErrSumTrans = getStartOffset() + 9;	// set offset for serialization
  
             beginIp08101CreFinFileDet = getStartOffset() + 10;	// set offset for serialization
  
             beginIp08101CreFinFileTot = getStartOffset() + 11;	// set offset for serialization
  
             beginIp08101CreFinTransTot = getStartOffset() + 12;	// set offset for serialization
  
             beginIp08101CreFinRunTot = getStartOffset() + 13;	// set offset for serialization
  
             beginIp08101CreThreshSum = getStartOffset() + 14;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp08101ThreshProcOptCounter = -1;
     public boolean isIp08101ThreshProcOptModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101ThreshProcOptCounter != sharedCounter;
         localIp08101ThreshProcOptCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_THRESH_PROC_OPT_LEN = 1;
	/**
	 * 	serialize this Ip08101ThreshProcOpt
	 */
   protected void serializeIp08101ThreshProcOpt(char[] ip08101ThreshProcOpt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101ThreshProcOpt,0,getStringValue(),beginIp08101ThreshProcOpt,IP_08101_THRESH_PROC_OPT_LEN);
       localIp08101ThreshProcOptCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101ThreshProcOptConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp08101ThreshProcOpt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101ThreshProcOpt() {	 
   		return (substring(getStringValue(),beginIp08101ThreshProcOpt,beginIp08101ThreshProcOpt + IP_08101_THRESH_PROC_OPT_LEN));
   	}
     int localIp08101RunIndicatorCounter = -1;
     public boolean isIp08101RunIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101RunIndicatorCounter != sharedCounter;
         localIp08101RunIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_RUN_INDICATOR_LEN = 1;
	/**
	 * 	serialize this Ip08101RunIndicator
	 */
   protected void serializeIp08101RunIndicator(char[] ip08101RunIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101RunIndicator,0,getStringValue(),beginIp08101RunIndicator,IP_08101_RUN_INDICATOR_LEN);
       localIp08101RunIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101RunIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp08101RunIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101RunIndicator() {	 
   		return (substring(getStringValue(),beginIp08101RunIndicator,beginIp08101RunIndicator + IP_08101_RUN_INDICATOR_LEN));
   	}
     int localIp08101RerunOptionCounter = -1;
     public boolean isIp08101RerunOptionModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101RerunOptionCounter != sharedCounter;
         localIp08101RerunOptionCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_RERUN_OPTION_LEN = 1;
	/**
	 * 	serialize this Ip08101RerunOption
	 */
   protected void serializeIp08101RerunOption(char[] ip08101RerunOption) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101RerunOption,0,getStringValue(),beginIp08101RerunOption,IP_08101_RERUN_OPTION_LEN);
       localIp08101RerunOptionCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101RerunOptionConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp08101RerunOption is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101RerunOption() {	 
   		return (substring(getStringValue(),beginIp08101RerunOption,beginIp08101RerunOption + IP_08101_RERUN_OPTION_LEN));
   	}
     int localIp08101LocationIndCounter = -1;
     public boolean isIp08101LocationIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101LocationIndCounter != sharedCounter;
         localIp08101LocationIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_LOCATION_IND_LEN = 1;
	/**
	 * 	serialize this Ip08101LocationInd
	 */
   protected void serializeIp08101LocationInd(char[] ip08101LocationInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101LocationInd,0,getStringValue(),beginIp08101LocationInd,IP_08101_LOCATION_IND_LEN);
       localIp08101LocationIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101LocationIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp08101LocationInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101LocationInd() {	 
   		return (substring(getStringValue(),beginIp08101LocationInd,beginIp08101LocationInd + IP_08101_LOCATION_IND_LEN));
   	}
     int localIp08101CreErrDetCoRptCounter = -1;
     public boolean isIp08101CreErrDetCoRptModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101CreErrDetCoRptCounter != sharedCounter;
         localIp08101CreErrDetCoRptCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_CRE_ERR_DET_CO_RPT_LEN = 1;
	/**
	 * 	serialize this Ip08101CreErrDetCoRpt
	 */
   protected void serializeIp08101CreErrDetCoRpt(char[] ip08101CreErrDetCoRpt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101CreErrDetCoRpt,0,getStringValue(),beginIp08101CreErrDetCoRpt,IP_08101_CRE_ERR_DET_CO_RPT_LEN);
       localIp08101CreErrDetCoRptCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101CreErrDetCoRptConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp08101CreErrDetCoRpt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101CreErrDetCoRpt() {	 
   		return (substring(getStringValue(),beginIp08101CreErrDetCoRpt,beginIp08101CreErrDetCoRpt + IP_08101_CRE_ERR_DET_CO_RPT_LEN));
   	}
     int localIp08101CreErrDetIpRptCounter = -1;
     public boolean isIp08101CreErrDetIpRptModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101CreErrDetIpRptCounter != sharedCounter;
         localIp08101CreErrDetIpRptCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_CRE_ERR_DET_IP_RPT_LEN = 1;
	/**
	 * 	serialize this Ip08101CreErrDetIpRpt
	 */
   protected void serializeIp08101CreErrDetIpRpt(char[] ip08101CreErrDetIpRpt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101CreErrDetIpRpt,0,getStringValue(),beginIp08101CreErrDetIpRpt,IP_08101_CRE_ERR_DET_IP_RPT_LEN);
       localIp08101CreErrDetIpRptCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101CreErrDetIpRptConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp08101CreErrDetIpRpt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101CreErrDetIpRpt() {	 
   		return (substring(getStringValue(),beginIp08101CreErrDetIpRpt,beginIp08101CreErrDetIpRpt + IP_08101_CRE_ERR_DET_IP_RPT_LEN));
   	}
     int localIp08101CreErrDetInstIdCounter = -1;
     public boolean isIp08101CreErrDetInstIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101CreErrDetInstIdCounter != sharedCounter;
         localIp08101CreErrDetInstIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_CRE_ERR_DET_INST_ID_LEN = 1;
	/**
	 * 	serialize this Ip08101CreErrDetInstId
	 */
   protected void serializeIp08101CreErrDetInstId(char[] ip08101CreErrDetInstId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101CreErrDetInstId,0,getStringValue(),beginIp08101CreErrDetInstId,IP_08101_CRE_ERR_DET_INST_ID_LEN);
       localIp08101CreErrDetInstIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101CreErrDetInstIdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp08101CreErrDetInstId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101CreErrDetInstId() {	 
   		return (substring(getStringValue(),beginIp08101CreErrDetInstId,beginIp08101CreErrDetInstId + IP_08101_CRE_ERR_DET_INST_ID_LEN));
   	}
     int localIp08101CreErrDetInstAcptCounter = -1;
     public boolean isIp08101CreErrDetInstAcptModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101CreErrDetInstAcptCounter != sharedCounter;
         localIp08101CreErrDetInstAcptCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_CRE_ERR_DET_INST_ACPT_LEN = 1;
	/**
	 * 	serialize this Ip08101CreErrDetInstAcpt
	 */
   protected void serializeIp08101CreErrDetInstAcpt(char[] ip08101CreErrDetInstAcpt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101CreErrDetInstAcpt,0,getStringValue(),beginIp08101CreErrDetInstAcpt,IP_08101_CRE_ERR_DET_INST_ACPT_LEN);
       localIp08101CreErrDetInstAcptCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101CreErrDetInstAcptConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp08101CreErrDetInstAcpt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101CreErrDetInstAcpt() {	 
   		return (substring(getStringValue(),beginIp08101CreErrDetInstAcpt,beginIp08101CreErrDetInstAcpt + IP_08101_CRE_ERR_DET_INST_ACPT_LEN));
   	}
     int localIp08101CreErrSumInstIdCounter = -1;
     public boolean isIp08101CreErrSumInstIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101CreErrSumInstIdCounter != sharedCounter;
         localIp08101CreErrSumInstIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_CRE_ERR_SUM_INST_ID_LEN = 1;
	/**
	 * 	serialize this Ip08101CreErrSumInstId
	 */
   protected void serializeIp08101CreErrSumInstId(char[] ip08101CreErrSumInstId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101CreErrSumInstId,0,getStringValue(),beginIp08101CreErrSumInstId,IP_08101_CRE_ERR_SUM_INST_ID_LEN);
       localIp08101CreErrSumInstIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101CreErrSumInstIdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp08101CreErrSumInstId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101CreErrSumInstId() {	 
   		return (substring(getStringValue(),beginIp08101CreErrSumInstId,beginIp08101CreErrSumInstId + IP_08101_CRE_ERR_SUM_INST_ID_LEN));
   	}
     int localIp08101CreErrSumTransCounter = -1;
     public boolean isIp08101CreErrSumTransModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101CreErrSumTransCounter != sharedCounter;
         localIp08101CreErrSumTransCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_CRE_ERR_SUM_TRANS_LEN = 1;
	/**
	 * 	serialize this Ip08101CreErrSumTrans
	 */
   protected void serializeIp08101CreErrSumTrans(char[] ip08101CreErrSumTrans) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101CreErrSumTrans,0,getStringValue(),beginIp08101CreErrSumTrans,IP_08101_CRE_ERR_SUM_TRANS_LEN);
       localIp08101CreErrSumTransCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101CreErrSumTransConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp08101CreErrSumTrans is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101CreErrSumTrans() {	 
   		return (substring(getStringValue(),beginIp08101CreErrSumTrans,beginIp08101CreErrSumTrans + IP_08101_CRE_ERR_SUM_TRANS_LEN));
   	}
     int localIp08101CreFinFileDetCounter = -1;
     public boolean isIp08101CreFinFileDetModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101CreFinFileDetCounter != sharedCounter;
         localIp08101CreFinFileDetCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_CRE_FIN_FILE_DET_LEN = 1;
	/**
	 * 	serialize this Ip08101CreFinFileDet
	 */
   protected void serializeIp08101CreFinFileDet(char[] ip08101CreFinFileDet) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101CreFinFileDet,0,getStringValue(),beginIp08101CreFinFileDet,IP_08101_CRE_FIN_FILE_DET_LEN);
       localIp08101CreFinFileDetCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101CreFinFileDetConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp08101CreFinFileDet is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101CreFinFileDet() {	 
   		return (substring(getStringValue(),beginIp08101CreFinFileDet,beginIp08101CreFinFileDet + IP_08101_CRE_FIN_FILE_DET_LEN));
   	}
     int localIp08101CreFinFileTotCounter = -1;
     public boolean isIp08101CreFinFileTotModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101CreFinFileTotCounter != sharedCounter;
         localIp08101CreFinFileTotCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_CRE_FIN_FILE_TOT_LEN = 1;
	/**
	 * 	serialize this Ip08101CreFinFileTot
	 */
   protected void serializeIp08101CreFinFileTot(char[] ip08101CreFinFileTot) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101CreFinFileTot,0,getStringValue(),beginIp08101CreFinFileTot,IP_08101_CRE_FIN_FILE_TOT_LEN);
       localIp08101CreFinFileTotCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101CreFinFileTotConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp08101CreFinFileTot is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101CreFinFileTot() {	 
   		return (substring(getStringValue(),beginIp08101CreFinFileTot,beginIp08101CreFinFileTot + IP_08101_CRE_FIN_FILE_TOT_LEN));
   	}
     int localIp08101CreFinTransTotCounter = -1;
     public boolean isIp08101CreFinTransTotModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101CreFinTransTotCounter != sharedCounter;
         localIp08101CreFinTransTotCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_CRE_FIN_TRANS_TOT_LEN = 1;
	/**
	 * 	serialize this Ip08101CreFinTransTot
	 */
   protected void serializeIp08101CreFinTransTot(char[] ip08101CreFinTransTot) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101CreFinTransTot,0,getStringValue(),beginIp08101CreFinTransTot,IP_08101_CRE_FIN_TRANS_TOT_LEN);
       localIp08101CreFinTransTotCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101CreFinTransTotConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp08101CreFinTransTot is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101CreFinTransTot() {	 
   		return (substring(getStringValue(),beginIp08101CreFinTransTot,beginIp08101CreFinTransTot + IP_08101_CRE_FIN_TRANS_TOT_LEN));
   	}
     int localIp08101CreFinRunTotCounter = -1;
     public boolean isIp08101CreFinRunTotModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101CreFinRunTotCounter != sharedCounter;
         localIp08101CreFinRunTotCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_CRE_FIN_RUN_TOT_LEN = 1;
	/**
	 * 	serialize this Ip08101CreFinRunTot
	 */
   protected void serializeIp08101CreFinRunTot(char[] ip08101CreFinRunTot) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101CreFinRunTot,0,getStringValue(),beginIp08101CreFinRunTot,IP_08101_CRE_FIN_RUN_TOT_LEN);
       localIp08101CreFinRunTotCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101CreFinRunTotConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp08101CreFinRunTot is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101CreFinRunTot() {	 
   		return (substring(getStringValue(),beginIp08101CreFinRunTot,beginIp08101CreFinRunTot + IP_08101_CRE_FIN_RUN_TOT_LEN));
   	}
     int localIp08101CreThreshSumCounter = -1;
     public boolean isIp08101CreThreshSumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp08101CreThreshSumCounter != sharedCounter;
         localIp08101CreThreshSumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_08101_CRE_THRESH_SUM_LEN = 1;
	/**
	 * 	serialize this Ip08101CreThreshSum
	 */
   protected void serializeIp08101CreThreshSum(char[] ip08101CreThreshSum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip08101CreThreshSum,0,getStringValue(),beginIp08101CreThreshSum,IP_08101_CRE_THRESH_SUM_LEN);
       localIp08101CreThreshSumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp08101CreThreshSumConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp08101CreThreshSum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp08101CreThreshSum() {	 
   		return (substring(getStringValue(),beginIp08101CreThreshSum,beginIp08101CreThreshSum + IP_08101_CRE_THRESH_SUM_LEN));
   	}




}
  
