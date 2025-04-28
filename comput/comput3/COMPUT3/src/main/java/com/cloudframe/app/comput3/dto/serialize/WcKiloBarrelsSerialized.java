package com.cloudframe.app.comput3.dto.serialize;

/**
*  The class WcKiloBarrelsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WcKiloBarrelsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcKiloBarrelsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WC_KILO_BARRELS_LENGTH = 108;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcKbBbl;
            protected  int beginWcKbKb;
            protected  int beginWcKbLit;
            protected  int beginWcKbM3;
            protected  int beginWcKbUsg;
            protected  int beginWcKbUkg;
            protected  int beginWcKbMmb;
            protected  int beginWcKbGbt;
            protected  int beginWcKbThm;
            protected  int beginWcKbMwh;
            protected  int beginWcKbGj;
            protected  int beginWcKbDay;
	
	/**
	* Constructor for WcKiloBarrelsSerialized
	**/
    public WcKiloBarrelsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcKiloBarrelsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcKiloBarrelsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcKiloBarrelsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,108); // serialize this field at offset 108 by default 
    }
    
	/**
	* sets parent for this WcKiloBarrelsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 108 by default
    }    
	/**
	* initializes the field in WcKiloBarrelsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WC_KILO_BARRELS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcKbBbl = getStartOffset() + 0;	// set offset for serialization
  
             beginWcKbKb = getStartOffset() + 9;	// set offset for serialization
  
             beginWcKbLit = getStartOffset() + 18;	// set offset for serialization
  
             beginWcKbM3 = getStartOffset() + 27;	// set offset for serialization
  
             beginWcKbUsg = getStartOffset() + 36;	// set offset for serialization
  
             beginWcKbUkg = getStartOffset() + 45;	// set offset for serialization
  
             beginWcKbMmb = getStartOffset() + 54;	// set offset for serialization
  
             beginWcKbGbt = getStartOffset() + 63;	// set offset for serialization
  
             beginWcKbThm = getStartOffset() + 72;	// set offset for serialization
  
             beginWcKbMwh = getStartOffset() + 81;	// set offset for serialization
  
             beginWcKbGj = getStartOffset() + 90;	// set offset for serialization
  
             beginWcKbDay = getStartOffset() + 99;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localWcKbBblCounter = -1;
        public boolean isWcKbBblModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcKbBblCounter != sharedCounter;
           localWcKbBblCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcKbBblIsNumeric() {
	      return decimalIsNumeric(beginWcKbBbl,WC_KB_BBL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcKbBblString() {
            return getPackedString(beginWcKbBbl,WC_KB_BBL_LEN);
         }
   protected static final int WC_KB_BBL_LEN = 9;
   protected static final int WC_KB_BBL_SCALE = 4;
  	/**
	 * 	serializeWcKbBbl
	 */
	protected void serializeWcKbBbl(BigDecimal wcKbBbl) {
		   putDecimal(beginWcKbBbl,wcKbBbl,WC_KB_BBL_LEN,WC_KB_BBL_SCALE,true);
		 localWcKbBblCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcKbBblMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcKbBbl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcKbBbl() throws CFException {	
   	try { 
		 return (getDecimal(beginWcKbBbl,WC_KB_BBL_LEN,WC_KB_BBL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcKbBbl", beginWcKbBbl,WC_KB_BBL_LEN);
     }
   	}
        int localWcKbKbCounter = -1;
        public boolean isWcKbKbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcKbKbCounter != sharedCounter;
           localWcKbKbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcKbKbIsNumeric() {
	      return decimalIsNumeric(beginWcKbKb,WC_KB_KB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcKbKbString() {
            return getPackedString(beginWcKbKb,WC_KB_KB_LEN);
         }
   protected static final int WC_KB_KB_LEN = 9;
   protected static final int WC_KB_KB_SCALE = 4;
  	/**
	 * 	serializeWcKbKb
	 */
	protected void serializeWcKbKb(BigDecimal wcKbKb) {
		   putDecimal(beginWcKbKb,wcKbKb,WC_KB_KB_LEN,WC_KB_KB_SCALE,true);
		 localWcKbKbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcKbKbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcKbKb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcKbKb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcKbKb,WC_KB_KB_LEN,WC_KB_KB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcKbKb", beginWcKbKb,WC_KB_KB_LEN);
     }
   	}
        int localWcKbLitCounter = -1;
        public boolean isWcKbLitModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcKbLitCounter != sharedCounter;
           localWcKbLitCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcKbLitIsNumeric() {
	      return decimalIsNumeric(beginWcKbLit,WC_KB_LIT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcKbLitString() {
            return getPackedString(beginWcKbLit,WC_KB_LIT_LEN);
         }
   protected static final int WC_KB_LIT_LEN = 9;
   protected static final int WC_KB_LIT_SCALE = 4;
  	/**
	 * 	serializeWcKbLit
	 */
	protected void serializeWcKbLit(BigDecimal wcKbLit) {
		   putDecimal(beginWcKbLit,wcKbLit,WC_KB_LIT_LEN,WC_KB_LIT_SCALE,true);
		 localWcKbLitCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcKbLitMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcKbLit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcKbLit() throws CFException {	
   	try { 
		 return (getDecimal(beginWcKbLit,WC_KB_LIT_LEN,WC_KB_LIT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcKbLit", beginWcKbLit,WC_KB_LIT_LEN);
     }
   	}
        int localWcKbM3Counter = -1;
        public boolean isWcKbM3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcKbM3Counter != sharedCounter;
           localWcKbM3Counter = sharedCounter; return hasModified; 
        }
	    public boolean wcKbM3IsNumeric() {
	      return decimalIsNumeric(beginWcKbM3,WC_KB_M_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcKbM3String() {
            return getPackedString(beginWcKbM3,WC_KB_M_3_LEN);
         }
   protected static final int WC_KB_M_3_LEN = 9;
   protected static final int WC_KB_M_3_SCALE = 4;
  	/**
	 * 	serializeWcKbM3
	 */
	protected void serializeWcKbM3(BigDecimal wcKbM3) {
		   putDecimal(beginWcKbM3,wcKbM3,WC_KB_M_3_LEN,WC_KB_M_3_SCALE,true);
		 localWcKbM3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcKbM3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcKbM3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcKbM3() throws CFException {	
   	try { 
		 return (getDecimal(beginWcKbM3,WC_KB_M_3_LEN,WC_KB_M_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcKbM3", beginWcKbM3,WC_KB_M_3_LEN);
     }
   	}
        int localWcKbUsgCounter = -1;
        public boolean isWcKbUsgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcKbUsgCounter != sharedCounter;
           localWcKbUsgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcKbUsgIsNumeric() {
	      return decimalIsNumeric(beginWcKbUsg,WC_KB_USG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcKbUsgString() {
            return getPackedString(beginWcKbUsg,WC_KB_USG_LEN);
         }
   protected static final int WC_KB_USG_LEN = 9;
   protected static final int WC_KB_USG_SCALE = 4;
  	/**
	 * 	serializeWcKbUsg
	 */
	protected void serializeWcKbUsg(BigDecimal wcKbUsg) {
		   putDecimal(beginWcKbUsg,wcKbUsg,WC_KB_USG_LEN,WC_KB_USG_SCALE,true);
		 localWcKbUsgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcKbUsgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcKbUsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcKbUsg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcKbUsg,WC_KB_USG_LEN,WC_KB_USG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcKbUsg", beginWcKbUsg,WC_KB_USG_LEN);
     }
   	}
        int localWcKbUkgCounter = -1;
        public boolean isWcKbUkgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcKbUkgCounter != sharedCounter;
           localWcKbUkgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcKbUkgIsNumeric() {
	      return decimalIsNumeric(beginWcKbUkg,WC_KB_UKG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcKbUkgString() {
            return getPackedString(beginWcKbUkg,WC_KB_UKG_LEN);
         }
   protected static final int WC_KB_UKG_LEN = 9;
   protected static final int WC_KB_UKG_SCALE = 4;
  	/**
	 * 	serializeWcKbUkg
	 */
	protected void serializeWcKbUkg(BigDecimal wcKbUkg) {
		   putDecimal(beginWcKbUkg,wcKbUkg,WC_KB_UKG_LEN,WC_KB_UKG_SCALE,true);
		 localWcKbUkgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcKbUkgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcKbUkg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcKbUkg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcKbUkg,WC_KB_UKG_LEN,WC_KB_UKG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcKbUkg", beginWcKbUkg,WC_KB_UKG_LEN);
     }
   	}
        int localWcKbMmbCounter = -1;
        public boolean isWcKbMmbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcKbMmbCounter != sharedCounter;
           localWcKbMmbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcKbMmbIsNumeric() {
	      return decimalIsNumeric(beginWcKbMmb,WC_KB_MMB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcKbMmbString() {
            return getPackedString(beginWcKbMmb,WC_KB_MMB_LEN);
         }
   protected static final int WC_KB_MMB_LEN = 9;
   protected static final int WC_KB_MMB_SCALE = 4;
  	/**
	 * 	serializeWcKbMmb
	 */
	protected void serializeWcKbMmb(BigDecimal wcKbMmb) {
		   putDecimal(beginWcKbMmb,wcKbMmb,WC_KB_MMB_LEN,WC_KB_MMB_SCALE,true);
		 localWcKbMmbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcKbMmbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcKbMmb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcKbMmb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcKbMmb,WC_KB_MMB_LEN,WC_KB_MMB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcKbMmb", beginWcKbMmb,WC_KB_MMB_LEN);
     }
   	}
        int localWcKbGbtCounter = -1;
        public boolean isWcKbGbtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcKbGbtCounter != sharedCounter;
           localWcKbGbtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcKbGbtIsNumeric() {
	      return decimalIsNumeric(beginWcKbGbt,WC_KB_GBT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcKbGbtString() {
            return getPackedString(beginWcKbGbt,WC_KB_GBT_LEN);
         }
   protected static final int WC_KB_GBT_LEN = 9;
   protected static final int WC_KB_GBT_SCALE = 4;
  	/**
	 * 	serializeWcKbGbt
	 */
	protected void serializeWcKbGbt(BigDecimal wcKbGbt) {
		   putDecimal(beginWcKbGbt,wcKbGbt,WC_KB_GBT_LEN,WC_KB_GBT_SCALE,true);
		 localWcKbGbtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcKbGbtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcKbGbt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcKbGbt() throws CFException {	
   	try { 
		 return (getDecimal(beginWcKbGbt,WC_KB_GBT_LEN,WC_KB_GBT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcKbGbt", beginWcKbGbt,WC_KB_GBT_LEN);
     }
   	}
        int localWcKbThmCounter = -1;
        public boolean isWcKbThmModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcKbThmCounter != sharedCounter;
           localWcKbThmCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcKbThmIsNumeric() {
	      return decimalIsNumeric(beginWcKbThm,WC_KB_THM_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcKbThmString() {
            return getPackedString(beginWcKbThm,WC_KB_THM_LEN);
         }
   protected static final int WC_KB_THM_LEN = 9;
   protected static final int WC_KB_THM_SCALE = 4;
  	/**
	 * 	serializeWcKbThm
	 */
	protected void serializeWcKbThm(BigDecimal wcKbThm) {
		   putDecimal(beginWcKbThm,wcKbThm,WC_KB_THM_LEN,WC_KB_THM_SCALE,true);
		 localWcKbThmCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcKbThmMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcKbThm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcKbThm() throws CFException {	
   	try { 
		 return (getDecimal(beginWcKbThm,WC_KB_THM_LEN,WC_KB_THM_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcKbThm", beginWcKbThm,WC_KB_THM_LEN);
     }
   	}
        int localWcKbMwhCounter = -1;
        public boolean isWcKbMwhModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcKbMwhCounter != sharedCounter;
           localWcKbMwhCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcKbMwhIsNumeric() {
	      return decimalIsNumeric(beginWcKbMwh,WC_KB_MWH_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcKbMwhString() {
            return getPackedString(beginWcKbMwh,WC_KB_MWH_LEN);
         }
   protected static final int WC_KB_MWH_LEN = 9;
   protected static final int WC_KB_MWH_SCALE = 4;
  	/**
	 * 	serializeWcKbMwh
	 */
	protected void serializeWcKbMwh(BigDecimal wcKbMwh) {
		   putDecimal(beginWcKbMwh,wcKbMwh,WC_KB_MWH_LEN,WC_KB_MWH_SCALE,true);
		 localWcKbMwhCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcKbMwhMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcKbMwh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcKbMwh() throws CFException {	
   	try { 
		 return (getDecimal(beginWcKbMwh,WC_KB_MWH_LEN,WC_KB_MWH_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcKbMwh", beginWcKbMwh,WC_KB_MWH_LEN);
     }
   	}
        int localWcKbGjCounter = -1;
        public boolean isWcKbGjModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcKbGjCounter != sharedCounter;
           localWcKbGjCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcKbGjIsNumeric() {
	      return decimalIsNumeric(beginWcKbGj,WC_KB_GJ_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcKbGjString() {
            return getPackedString(beginWcKbGj,WC_KB_GJ_LEN);
         }
   protected static final int WC_KB_GJ_LEN = 9;
   protected static final int WC_KB_GJ_SCALE = 4;
  	/**
	 * 	serializeWcKbGj
	 */
	protected void serializeWcKbGj(BigDecimal wcKbGj) {
		   putDecimal(beginWcKbGj,wcKbGj,WC_KB_GJ_LEN,WC_KB_GJ_SCALE,true);
		 localWcKbGjCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcKbGjMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcKbGj is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcKbGj() throws CFException {	
   	try { 
		 return (getDecimal(beginWcKbGj,WC_KB_GJ_LEN,WC_KB_GJ_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcKbGj", beginWcKbGj,WC_KB_GJ_LEN);
     }
   	}
        int localWcKbDayCounter = -1;
        public boolean isWcKbDayModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcKbDayCounter != sharedCounter;
           localWcKbDayCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcKbDayIsNumeric() {
	      return decimalIsNumeric(beginWcKbDay,WC_KB_DAY_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcKbDayString() {
            return getPackedString(beginWcKbDay,WC_KB_DAY_LEN);
         }
   protected static final int WC_KB_DAY_LEN = 9;
   protected static final int WC_KB_DAY_SCALE = 4;
  	/**
	 * 	serializeWcKbDay
	 */
	protected void serializeWcKbDay(BigDecimal wcKbDay) {
		   putDecimal(beginWcKbDay,wcKbDay,WC_KB_DAY_LEN,WC_KB_DAY_SCALE,true);
		 localWcKbDayCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcKbDayMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcKbDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcKbDay() throws CFException {	
   	try { 
		 return (getDecimal(beginWcKbDay,WC_KB_DAY_LEN,WC_KB_DAY_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcKbDay", beginWcKbDay,WC_KB_DAY_LEN);
     }
   	}




}
  
