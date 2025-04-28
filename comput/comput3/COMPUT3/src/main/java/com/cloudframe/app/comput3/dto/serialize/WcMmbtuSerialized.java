package com.cloudframe.app.comput3.dto.serialize;

/**
*  The class WcMmbtuSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:50. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WcMmbtuSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcMmbtuSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WC_MMBTU_LENGTH = 108;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcMmbBbl;
            protected  int beginWcMmbKb;
            protected  int beginWcMmbLit;
            protected  int beginWcMmbM3;
            protected  int beginWcMmbUsg;
            protected  int beginWcMmbUkg;
            protected  int beginWcMmbMmb;
            protected  int beginWcMmbGbt;
            protected  int beginWcMmbThm;
            protected  int beginWcMmbMwh;
            protected  int beginWcMmbGj;
            protected  int beginWcMmbDay;
	
	/**
	* Constructor for WcMmbtuSerialized
	**/
    public WcMmbtuSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcMmbtuSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcMmbtuSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcMmbtuSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,648); // serialize this field at offset 648 by default 
    }
    
	/**
	* sets parent for this WcMmbtuSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 648 by default
    }    
	/**
	* initializes the field in WcMmbtuSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WC_MMBTU_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcMmbBbl = getStartOffset() + 0;	// set offset for serialization
  
             beginWcMmbKb = getStartOffset() + 9;	// set offset for serialization
  
             beginWcMmbLit = getStartOffset() + 18;	// set offset for serialization
  
             beginWcMmbM3 = getStartOffset() + 27;	// set offset for serialization
  
             beginWcMmbUsg = getStartOffset() + 36;	// set offset for serialization
  
             beginWcMmbUkg = getStartOffset() + 45;	// set offset for serialization
  
             beginWcMmbMmb = getStartOffset() + 54;	// set offset for serialization
  
             beginWcMmbGbt = getStartOffset() + 63;	// set offset for serialization
  
             beginWcMmbThm = getStartOffset() + 72;	// set offset for serialization
  
             beginWcMmbMwh = getStartOffset() + 81;	// set offset for serialization
  
             beginWcMmbGj = getStartOffset() + 90;	// set offset for serialization
  
             beginWcMmbDay = getStartOffset() + 99;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localWcMmbBblCounter = -1;
        public boolean isWcMmbBblModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMmbBblCounter != sharedCounter;
           localWcMmbBblCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMmbBblIsNumeric() {
	      return decimalIsNumeric(beginWcMmbBbl,WC_MMB_BBL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMmbBblString() {
            return getPackedString(beginWcMmbBbl,WC_MMB_BBL_LEN);
         }
   protected static final int WC_MMB_BBL_LEN = 9;
   protected static final int WC_MMB_BBL_SCALE = 4;
  	/**
	 * 	serializeWcMmbBbl
	 */
	protected void serializeWcMmbBbl(BigDecimal wcMmbBbl) {
		   putDecimal(beginWcMmbBbl,wcMmbBbl,WC_MMB_BBL_LEN,WC_MMB_BBL_SCALE,true);
		 localWcMmbBblCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMmbBblMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMmbBbl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMmbBbl() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMmbBbl,WC_MMB_BBL_LEN,WC_MMB_BBL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMmbBbl", beginWcMmbBbl,WC_MMB_BBL_LEN);
     }
   	}
        int localWcMmbKbCounter = -1;
        public boolean isWcMmbKbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMmbKbCounter != sharedCounter;
           localWcMmbKbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMmbKbIsNumeric() {
	      return decimalIsNumeric(beginWcMmbKb,WC_MMB_KB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMmbKbString() {
            return getPackedString(beginWcMmbKb,WC_MMB_KB_LEN);
         }
   protected static final int WC_MMB_KB_LEN = 9;
   protected static final int WC_MMB_KB_SCALE = 4;
  	/**
	 * 	serializeWcMmbKb
	 */
	protected void serializeWcMmbKb(BigDecimal wcMmbKb) {
		   putDecimal(beginWcMmbKb,wcMmbKb,WC_MMB_KB_LEN,WC_MMB_KB_SCALE,true);
		 localWcMmbKbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMmbKbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMmbKb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMmbKb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMmbKb,WC_MMB_KB_LEN,WC_MMB_KB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMmbKb", beginWcMmbKb,WC_MMB_KB_LEN);
     }
   	}
        int localWcMmbLitCounter = -1;
        public boolean isWcMmbLitModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMmbLitCounter != sharedCounter;
           localWcMmbLitCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMmbLitIsNumeric() {
	      return decimalIsNumeric(beginWcMmbLit,WC_MMB_LIT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMmbLitString() {
            return getPackedString(beginWcMmbLit,WC_MMB_LIT_LEN);
         }
   protected static final int WC_MMB_LIT_LEN = 9;
   protected static final int WC_MMB_LIT_SCALE = 4;
  	/**
	 * 	serializeWcMmbLit
	 */
	protected void serializeWcMmbLit(BigDecimal wcMmbLit) {
		   putDecimal(beginWcMmbLit,wcMmbLit,WC_MMB_LIT_LEN,WC_MMB_LIT_SCALE,true);
		 localWcMmbLitCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMmbLitMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMmbLit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMmbLit() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMmbLit,WC_MMB_LIT_LEN,WC_MMB_LIT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMmbLit", beginWcMmbLit,WC_MMB_LIT_LEN);
     }
   	}
        int localWcMmbM3Counter = -1;
        public boolean isWcMmbM3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMmbM3Counter != sharedCounter;
           localWcMmbM3Counter = sharedCounter; return hasModified; 
        }
	    public boolean wcMmbM3IsNumeric() {
	      return decimalIsNumeric(beginWcMmbM3,WC_MMB_M_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMmbM3String() {
            return getPackedString(beginWcMmbM3,WC_MMB_M_3_LEN);
         }
   protected static final int WC_MMB_M_3_LEN = 9;
   protected static final int WC_MMB_M_3_SCALE = 4;
  	/**
	 * 	serializeWcMmbM3
	 */
	protected void serializeWcMmbM3(BigDecimal wcMmbM3) {
		   putDecimal(beginWcMmbM3,wcMmbM3,WC_MMB_M_3_LEN,WC_MMB_M_3_SCALE,true);
		 localWcMmbM3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMmbM3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMmbM3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMmbM3() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMmbM3,WC_MMB_M_3_LEN,WC_MMB_M_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMmbM3", beginWcMmbM3,WC_MMB_M_3_LEN);
     }
   	}
        int localWcMmbUsgCounter = -1;
        public boolean isWcMmbUsgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMmbUsgCounter != sharedCounter;
           localWcMmbUsgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMmbUsgIsNumeric() {
	      return decimalIsNumeric(beginWcMmbUsg,WC_MMB_USG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMmbUsgString() {
            return getPackedString(beginWcMmbUsg,WC_MMB_USG_LEN);
         }
   protected static final int WC_MMB_USG_LEN = 9;
   protected static final int WC_MMB_USG_SCALE = 4;
  	/**
	 * 	serializeWcMmbUsg
	 */
	protected void serializeWcMmbUsg(BigDecimal wcMmbUsg) {
		   putDecimal(beginWcMmbUsg,wcMmbUsg,WC_MMB_USG_LEN,WC_MMB_USG_SCALE,true);
		 localWcMmbUsgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMmbUsgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMmbUsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMmbUsg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMmbUsg,WC_MMB_USG_LEN,WC_MMB_USG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMmbUsg", beginWcMmbUsg,WC_MMB_USG_LEN);
     }
   	}
        int localWcMmbUkgCounter = -1;
        public boolean isWcMmbUkgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMmbUkgCounter != sharedCounter;
           localWcMmbUkgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMmbUkgIsNumeric() {
	      return decimalIsNumeric(beginWcMmbUkg,WC_MMB_UKG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMmbUkgString() {
            return getPackedString(beginWcMmbUkg,WC_MMB_UKG_LEN);
         }
   protected static final int WC_MMB_UKG_LEN = 9;
   protected static final int WC_MMB_UKG_SCALE = 4;
  	/**
	 * 	serializeWcMmbUkg
	 */
	protected void serializeWcMmbUkg(BigDecimal wcMmbUkg) {
		   putDecimal(beginWcMmbUkg,wcMmbUkg,WC_MMB_UKG_LEN,WC_MMB_UKG_SCALE,true);
		 localWcMmbUkgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMmbUkgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMmbUkg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMmbUkg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMmbUkg,WC_MMB_UKG_LEN,WC_MMB_UKG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMmbUkg", beginWcMmbUkg,WC_MMB_UKG_LEN);
     }
   	}
        int localWcMmbMmbCounter = -1;
        public boolean isWcMmbMmbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMmbMmbCounter != sharedCounter;
           localWcMmbMmbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMmbMmbIsNumeric() {
	      return decimalIsNumeric(beginWcMmbMmb,WC_MMB_MMB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMmbMmbString() {
            return getPackedString(beginWcMmbMmb,WC_MMB_MMB_LEN);
         }
   protected static final int WC_MMB_MMB_LEN = 9;
   protected static final int WC_MMB_MMB_SCALE = 4;
  	/**
	 * 	serializeWcMmbMmb
	 */
	protected void serializeWcMmbMmb(BigDecimal wcMmbMmb) {
		   putDecimal(beginWcMmbMmb,wcMmbMmb,WC_MMB_MMB_LEN,WC_MMB_MMB_SCALE,true);
		 localWcMmbMmbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMmbMmbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMmbMmb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMmbMmb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMmbMmb,WC_MMB_MMB_LEN,WC_MMB_MMB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMmbMmb", beginWcMmbMmb,WC_MMB_MMB_LEN);
     }
   	}
        int localWcMmbGbtCounter = -1;
        public boolean isWcMmbGbtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMmbGbtCounter != sharedCounter;
           localWcMmbGbtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMmbGbtIsNumeric() {
	      return decimalIsNumeric(beginWcMmbGbt,WC_MMB_GBT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMmbGbtString() {
            return getPackedString(beginWcMmbGbt,WC_MMB_GBT_LEN);
         }
   protected static final int WC_MMB_GBT_LEN = 9;
   protected static final int WC_MMB_GBT_SCALE = 4;
  	/**
	 * 	serializeWcMmbGbt
	 */
	protected void serializeWcMmbGbt(BigDecimal wcMmbGbt) {
		   putDecimal(beginWcMmbGbt,wcMmbGbt,WC_MMB_GBT_LEN,WC_MMB_GBT_SCALE,true);
		 localWcMmbGbtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMmbGbtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMmbGbt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMmbGbt() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMmbGbt,WC_MMB_GBT_LEN,WC_MMB_GBT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMmbGbt", beginWcMmbGbt,WC_MMB_GBT_LEN);
     }
   	}
        int localWcMmbThmCounter = -1;
        public boolean isWcMmbThmModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMmbThmCounter != sharedCounter;
           localWcMmbThmCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMmbThmIsNumeric() {
	      return decimalIsNumeric(beginWcMmbThm,WC_MMB_THM_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMmbThmString() {
            return getPackedString(beginWcMmbThm,WC_MMB_THM_LEN);
         }
   protected static final int WC_MMB_THM_LEN = 9;
   protected static final int WC_MMB_THM_SCALE = 4;
  	/**
	 * 	serializeWcMmbThm
	 */
	protected void serializeWcMmbThm(BigDecimal wcMmbThm) {
		   putDecimal(beginWcMmbThm,wcMmbThm,WC_MMB_THM_LEN,WC_MMB_THM_SCALE,true);
		 localWcMmbThmCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMmbThmMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMmbThm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMmbThm() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMmbThm,WC_MMB_THM_LEN,WC_MMB_THM_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMmbThm", beginWcMmbThm,WC_MMB_THM_LEN);
     }
   	}
        int localWcMmbMwhCounter = -1;
        public boolean isWcMmbMwhModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMmbMwhCounter != sharedCounter;
           localWcMmbMwhCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMmbMwhIsNumeric() {
	      return decimalIsNumeric(beginWcMmbMwh,WC_MMB_MWH_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMmbMwhString() {
            return getPackedString(beginWcMmbMwh,WC_MMB_MWH_LEN);
         }
   protected static final int WC_MMB_MWH_LEN = 9;
   protected static final int WC_MMB_MWH_SCALE = 4;
  	/**
	 * 	serializeWcMmbMwh
	 */
	protected void serializeWcMmbMwh(BigDecimal wcMmbMwh) {
		   putDecimal(beginWcMmbMwh,wcMmbMwh,WC_MMB_MWH_LEN,WC_MMB_MWH_SCALE,true);
		 localWcMmbMwhCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMmbMwhMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMmbMwh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMmbMwh() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMmbMwh,WC_MMB_MWH_LEN,WC_MMB_MWH_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMmbMwh", beginWcMmbMwh,WC_MMB_MWH_LEN);
     }
   	}
        int localWcMmbGjCounter = -1;
        public boolean isWcMmbGjModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMmbGjCounter != sharedCounter;
           localWcMmbGjCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMmbGjIsNumeric() {
	      return decimalIsNumeric(beginWcMmbGj,WC_MMB_GJ_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMmbGjString() {
            return getPackedString(beginWcMmbGj,WC_MMB_GJ_LEN);
         }
   protected static final int WC_MMB_GJ_LEN = 9;
   protected static final int WC_MMB_GJ_SCALE = 4;
  	/**
	 * 	serializeWcMmbGj
	 */
	protected void serializeWcMmbGj(BigDecimal wcMmbGj) {
		   putDecimal(beginWcMmbGj,wcMmbGj,WC_MMB_GJ_LEN,WC_MMB_GJ_SCALE,true);
		 localWcMmbGjCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMmbGjMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMmbGj is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMmbGj() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMmbGj,WC_MMB_GJ_LEN,WC_MMB_GJ_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMmbGj", beginWcMmbGj,WC_MMB_GJ_LEN);
     }
   	}
        int localWcMmbDayCounter = -1;
        public boolean isWcMmbDayModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcMmbDayCounter != sharedCounter;
           localWcMmbDayCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcMmbDayIsNumeric() {
	      return decimalIsNumeric(beginWcMmbDay,WC_MMB_DAY_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcMmbDayString() {
            return getPackedString(beginWcMmbDay,WC_MMB_DAY_LEN);
         }
   protected static final int WC_MMB_DAY_LEN = 9;
   protected static final int WC_MMB_DAY_SCALE = 4;
  	/**
	 * 	serializeWcMmbDay
	 */
	protected void serializeWcMmbDay(BigDecimal wcMmbDay) {
		   putDecimal(beginWcMmbDay,wcMmbDay,WC_MMB_DAY_LEN,WC_MMB_DAY_SCALE,true);
		 localWcMmbDayCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcMmbDayMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcMmbDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcMmbDay() throws CFException {	
   	try { 
		 return (getDecimal(beginWcMmbDay,WC_MMB_DAY_LEN,WC_MMB_DAY_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcMmbDay", beginWcMmbDay,WC_MMB_DAY_LEN);
     }
   	}




}
  
