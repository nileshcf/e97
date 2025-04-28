package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup81Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup81Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup81Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_81_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2481S;
            protected  int beginIp65504P2481L;
            protected  int beginIp65504P2482S;
            protected  int beginIp65504P2482L;
            protected  int beginIp65504P2483S;
            protected  int beginIp65504P2483L;
            protected  int beginIp65504P2484S;
            protected  int beginIp65504P2484L;
            protected  int beginIp65504P2485S;
            protected  int beginIp65504P2485L;
            protected  int beginIp65504P2486S;
            protected  int beginIp65504P2486L;
            protected  int beginIp65504P2487S;
            protected  int beginIp65504P2487L;
            protected  int beginIp65504P2488S;
            protected  int beginIp65504P2488L;
            protected  int beginIp65504P2489S;
            protected  int beginIp65504P2489L;
            protected  int beginIp65504P2490S;
            protected  int beginIp65504P2490L;
            protected  int beginIp65504P2491S;
            protected  int beginIp65504P2491L;
            protected  int beginIp65504P2492S;
            protected  int beginIp65504P2492L;
            protected  int beginIp65504P2493S;
            protected  int beginIp65504P2493L;
            protected  int beginIp65504P2494S;
            protected  int beginIp65504P2494L;
            protected  int beginIp65504P2495S;
            protected  int beginIp65504P2495L;
            protected  int beginIp65504P2496S;
            protected  int beginIp65504P2496L;
            protected  int beginIp65504P2497S;
            protected  int beginIp65504P2497L;
            protected  int beginIp65504P2498S;
            protected  int beginIp65504P2498L;
            protected  int beginIp65504P2499S;
            protected  int beginIp65504P2499L;
            protected  int beginIp65504P2500S;
            protected  int beginIp65504P2500L;
            protected  int beginIp65504P2501S;
            protected  int beginIp65504P2501L;
            protected  int beginIp65504P2502S;
            protected  int beginIp65504P2502L;
            protected  int beginIp65504P2503S;
            protected  int beginIp65504P2503L;
            protected  int beginIp65504P2504S;
            protected  int beginIp65504P2504L;
            protected  int beginIp65504P2505S;
            protected  int beginIp65504P2505L;
            protected  int beginIp65504P2506S;
            protected  int beginIp65504P2506L;
            protected  int beginIp65504P2507S;
            protected  int beginIp65504P2507L;
            protected  int beginIp65504P2508S;
            protected  int beginIp65504P2508L;
            protected  int beginIp65504P2509S;
            protected  int beginIp65504P2509L;
            protected  int beginIp65504P2510S;
            protected  int beginIp65504P2510L;
            protected  int beginIp65504P2511S;
            protected  int beginIp65504P2511L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup81Serialized
	**/
    public Ip65504PdsNamesLargeGroup81Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup81Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup81Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup81Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,19836); // serialize this field at offset 19836 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup81Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 19836 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup81Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_81_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2481S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2481L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2482S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2482L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2483S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2483L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2484S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2484L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2485S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2485L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2486S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2486L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2487S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2487L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2488S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2488L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2489S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2489L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2490S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2490L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2491S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2491L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2492S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2492L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2493S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2493L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2494S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2494L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2495S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2495L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2496S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2496L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2497S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2497L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2498S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2498L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2499S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2499L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2500S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2500L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2501S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2501L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2502S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2502L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2503S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2503L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2504S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2504L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2505S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2505L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2506S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2506L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2507S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2507L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2508S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2508L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2509S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2509L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2510S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2510L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2511S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2511L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2481SCounter = -1;
         public boolean isIp65504P2481SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2481SCounter != sharedCounter;
            localIp65504P2481SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2481_S_LEN = 2;
  	/**
	 * serializeIp65504P2481S
	 */
	protected void serializeIp65504P2481S(short ip65504P2481S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2481S,IP_65504_P_2481_S_LEN)
                  ,beginIp65504P2481S
                  ,IP_65504_P_2481_S_LEN
                 );
            localIp65504P2481SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2481SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2481S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2481S() {	 
			return (getShort(beginIp65504P2481S));
   	}
         int localIp65504P2481LCounter = -1;
         public boolean isIp65504P2481LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2481LCounter != sharedCounter;
            localIp65504P2481LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2481_L_LEN = 2;
  	/**
	 * serializeIp65504P2481L
	 */
	protected void serializeIp65504P2481L(short ip65504P2481L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2481L,IP_65504_P_2481_L_LEN)
                  ,beginIp65504P2481L
                  ,IP_65504_P_2481_L_LEN
                 );
            localIp65504P2481LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2481LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2481L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2481L() {	 
			return (getShort(beginIp65504P2481L));
   	}
         int localIp65504P2482SCounter = -1;
         public boolean isIp65504P2482SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2482SCounter != sharedCounter;
            localIp65504P2482SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2482_S_LEN = 2;
  	/**
	 * serializeIp65504P2482S
	 */
	protected void serializeIp65504P2482S(short ip65504P2482S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2482S,IP_65504_P_2482_S_LEN)
                  ,beginIp65504P2482S
                  ,IP_65504_P_2482_S_LEN
                 );
            localIp65504P2482SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2482SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2482S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2482S() {	 
			return (getShort(beginIp65504P2482S));
   	}
         int localIp65504P2482LCounter = -1;
         public boolean isIp65504P2482LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2482LCounter != sharedCounter;
            localIp65504P2482LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2482_L_LEN = 2;
  	/**
	 * serializeIp65504P2482L
	 */
	protected void serializeIp65504P2482L(short ip65504P2482L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2482L,IP_65504_P_2482_L_LEN)
                  ,beginIp65504P2482L
                  ,IP_65504_P_2482_L_LEN
                 );
            localIp65504P2482LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2482LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2482L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2482L() {	 
			return (getShort(beginIp65504P2482L));
   	}
         int localIp65504P2483SCounter = -1;
         public boolean isIp65504P2483SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2483SCounter != sharedCounter;
            localIp65504P2483SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2483_S_LEN = 2;
  	/**
	 * serializeIp65504P2483S
	 */
	protected void serializeIp65504P2483S(short ip65504P2483S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2483S,IP_65504_P_2483_S_LEN)
                  ,beginIp65504P2483S
                  ,IP_65504_P_2483_S_LEN
                 );
            localIp65504P2483SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2483SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2483S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2483S() {	 
			return (getShort(beginIp65504P2483S));
   	}
         int localIp65504P2483LCounter = -1;
         public boolean isIp65504P2483LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2483LCounter != sharedCounter;
            localIp65504P2483LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2483_L_LEN = 2;
  	/**
	 * serializeIp65504P2483L
	 */
	protected void serializeIp65504P2483L(short ip65504P2483L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2483L,IP_65504_P_2483_L_LEN)
                  ,beginIp65504P2483L
                  ,IP_65504_P_2483_L_LEN
                 );
            localIp65504P2483LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2483LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2483L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2483L() {	 
			return (getShort(beginIp65504P2483L));
   	}
         int localIp65504P2484SCounter = -1;
         public boolean isIp65504P2484SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2484SCounter != sharedCounter;
            localIp65504P2484SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2484_S_LEN = 2;
  	/**
	 * serializeIp65504P2484S
	 */
	protected void serializeIp65504P2484S(short ip65504P2484S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2484S,IP_65504_P_2484_S_LEN)
                  ,beginIp65504P2484S
                  ,IP_65504_P_2484_S_LEN
                 );
            localIp65504P2484SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2484SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2484S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2484S() {	 
			return (getShort(beginIp65504P2484S));
   	}
         int localIp65504P2484LCounter = -1;
         public boolean isIp65504P2484LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2484LCounter != sharedCounter;
            localIp65504P2484LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2484_L_LEN = 2;
  	/**
	 * serializeIp65504P2484L
	 */
	protected void serializeIp65504P2484L(short ip65504P2484L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2484L,IP_65504_P_2484_L_LEN)
                  ,beginIp65504P2484L
                  ,IP_65504_P_2484_L_LEN
                 );
            localIp65504P2484LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2484LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2484L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2484L() {	 
			return (getShort(beginIp65504P2484L));
   	}
         int localIp65504P2485SCounter = -1;
         public boolean isIp65504P2485SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2485SCounter != sharedCounter;
            localIp65504P2485SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2485_S_LEN = 2;
  	/**
	 * serializeIp65504P2485S
	 */
	protected void serializeIp65504P2485S(short ip65504P2485S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2485S,IP_65504_P_2485_S_LEN)
                  ,beginIp65504P2485S
                  ,IP_65504_P_2485_S_LEN
                 );
            localIp65504P2485SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2485SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2485S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2485S() {	 
			return (getShort(beginIp65504P2485S));
   	}
         int localIp65504P2485LCounter = -1;
         public boolean isIp65504P2485LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2485LCounter != sharedCounter;
            localIp65504P2485LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2485_L_LEN = 2;
  	/**
	 * serializeIp65504P2485L
	 */
	protected void serializeIp65504P2485L(short ip65504P2485L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2485L,IP_65504_P_2485_L_LEN)
                  ,beginIp65504P2485L
                  ,IP_65504_P_2485_L_LEN
                 );
            localIp65504P2485LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2485LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2485L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2485L() {	 
			return (getShort(beginIp65504P2485L));
   	}
         int localIp65504P2486SCounter = -1;
         public boolean isIp65504P2486SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2486SCounter != sharedCounter;
            localIp65504P2486SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2486_S_LEN = 2;
  	/**
	 * serializeIp65504P2486S
	 */
	protected void serializeIp65504P2486S(short ip65504P2486S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2486S,IP_65504_P_2486_S_LEN)
                  ,beginIp65504P2486S
                  ,IP_65504_P_2486_S_LEN
                 );
            localIp65504P2486SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2486SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2486S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2486S() {	 
			return (getShort(beginIp65504P2486S));
   	}
         int localIp65504P2486LCounter = -1;
         public boolean isIp65504P2486LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2486LCounter != sharedCounter;
            localIp65504P2486LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2486_L_LEN = 2;
  	/**
	 * serializeIp65504P2486L
	 */
	protected void serializeIp65504P2486L(short ip65504P2486L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2486L,IP_65504_P_2486_L_LEN)
                  ,beginIp65504P2486L
                  ,IP_65504_P_2486_L_LEN
                 );
            localIp65504P2486LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2486LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2486L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2486L() {	 
			return (getShort(beginIp65504P2486L));
   	}
         int localIp65504P2487SCounter = -1;
         public boolean isIp65504P2487SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2487SCounter != sharedCounter;
            localIp65504P2487SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2487_S_LEN = 2;
  	/**
	 * serializeIp65504P2487S
	 */
	protected void serializeIp65504P2487S(short ip65504P2487S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2487S,IP_65504_P_2487_S_LEN)
                  ,beginIp65504P2487S
                  ,IP_65504_P_2487_S_LEN
                 );
            localIp65504P2487SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2487SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2487S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2487S() {	 
			return (getShort(beginIp65504P2487S));
   	}
         int localIp65504P2487LCounter = -1;
         public boolean isIp65504P2487LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2487LCounter != sharedCounter;
            localIp65504P2487LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2487_L_LEN = 2;
  	/**
	 * serializeIp65504P2487L
	 */
	protected void serializeIp65504P2487L(short ip65504P2487L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2487L,IP_65504_P_2487_L_LEN)
                  ,beginIp65504P2487L
                  ,IP_65504_P_2487_L_LEN
                 );
            localIp65504P2487LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2487LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2487L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2487L() {	 
			return (getShort(beginIp65504P2487L));
   	}
         int localIp65504P2488SCounter = -1;
         public boolean isIp65504P2488SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2488SCounter != sharedCounter;
            localIp65504P2488SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2488_S_LEN = 2;
  	/**
	 * serializeIp65504P2488S
	 */
	protected void serializeIp65504P2488S(short ip65504P2488S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2488S,IP_65504_P_2488_S_LEN)
                  ,beginIp65504P2488S
                  ,IP_65504_P_2488_S_LEN
                 );
            localIp65504P2488SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2488SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2488S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2488S() {	 
			return (getShort(beginIp65504P2488S));
   	}
         int localIp65504P2488LCounter = -1;
         public boolean isIp65504P2488LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2488LCounter != sharedCounter;
            localIp65504P2488LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2488_L_LEN = 2;
  	/**
	 * serializeIp65504P2488L
	 */
	protected void serializeIp65504P2488L(short ip65504P2488L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2488L,IP_65504_P_2488_L_LEN)
                  ,beginIp65504P2488L
                  ,IP_65504_P_2488_L_LEN
                 );
            localIp65504P2488LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2488LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2488L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2488L() {	 
			return (getShort(beginIp65504P2488L));
   	}
         int localIp65504P2489SCounter = -1;
         public boolean isIp65504P2489SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2489SCounter != sharedCounter;
            localIp65504P2489SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2489_S_LEN = 2;
  	/**
	 * serializeIp65504P2489S
	 */
	protected void serializeIp65504P2489S(short ip65504P2489S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2489S,IP_65504_P_2489_S_LEN)
                  ,beginIp65504P2489S
                  ,IP_65504_P_2489_S_LEN
                 );
            localIp65504P2489SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2489SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2489S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2489S() {	 
			return (getShort(beginIp65504P2489S));
   	}
         int localIp65504P2489LCounter = -1;
         public boolean isIp65504P2489LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2489LCounter != sharedCounter;
            localIp65504P2489LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2489_L_LEN = 2;
  	/**
	 * serializeIp65504P2489L
	 */
	protected void serializeIp65504P2489L(short ip65504P2489L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2489L,IP_65504_P_2489_L_LEN)
                  ,beginIp65504P2489L
                  ,IP_65504_P_2489_L_LEN
                 );
            localIp65504P2489LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2489LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2489L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2489L() {	 
			return (getShort(beginIp65504P2489L));
   	}
         int localIp65504P2490SCounter = -1;
         public boolean isIp65504P2490SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2490SCounter != sharedCounter;
            localIp65504P2490SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2490_S_LEN = 2;
  	/**
	 * serializeIp65504P2490S
	 */
	protected void serializeIp65504P2490S(short ip65504P2490S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2490S,IP_65504_P_2490_S_LEN)
                  ,beginIp65504P2490S
                  ,IP_65504_P_2490_S_LEN
                 );
            localIp65504P2490SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2490SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2490S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2490S() {	 
			return (getShort(beginIp65504P2490S));
   	}
         int localIp65504P2490LCounter = -1;
         public boolean isIp65504P2490LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2490LCounter != sharedCounter;
            localIp65504P2490LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2490_L_LEN = 2;
  	/**
	 * serializeIp65504P2490L
	 */
	protected void serializeIp65504P2490L(short ip65504P2490L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2490L,IP_65504_P_2490_L_LEN)
                  ,beginIp65504P2490L
                  ,IP_65504_P_2490_L_LEN
                 );
            localIp65504P2490LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2490LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2490L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2490L() {	 
			return (getShort(beginIp65504P2490L));
   	}
         int localIp65504P2491SCounter = -1;
         public boolean isIp65504P2491SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2491SCounter != sharedCounter;
            localIp65504P2491SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2491_S_LEN = 2;
  	/**
	 * serializeIp65504P2491S
	 */
	protected void serializeIp65504P2491S(short ip65504P2491S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2491S,IP_65504_P_2491_S_LEN)
                  ,beginIp65504P2491S
                  ,IP_65504_P_2491_S_LEN
                 );
            localIp65504P2491SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2491SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2491S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2491S() {	 
			return (getShort(beginIp65504P2491S));
   	}
         int localIp65504P2491LCounter = -1;
         public boolean isIp65504P2491LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2491LCounter != sharedCounter;
            localIp65504P2491LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2491_L_LEN = 2;
  	/**
	 * serializeIp65504P2491L
	 */
	protected void serializeIp65504P2491L(short ip65504P2491L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2491L,IP_65504_P_2491_L_LEN)
                  ,beginIp65504P2491L
                  ,IP_65504_P_2491_L_LEN
                 );
            localIp65504P2491LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2491LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2491L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2491L() {	 
			return (getShort(beginIp65504P2491L));
   	}
         int localIp65504P2492SCounter = -1;
         public boolean isIp65504P2492SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2492SCounter != sharedCounter;
            localIp65504P2492SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2492_S_LEN = 2;
  	/**
	 * serializeIp65504P2492S
	 */
	protected void serializeIp65504P2492S(short ip65504P2492S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2492S,IP_65504_P_2492_S_LEN)
                  ,beginIp65504P2492S
                  ,IP_65504_P_2492_S_LEN
                 );
            localIp65504P2492SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2492SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2492S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2492S() {	 
			return (getShort(beginIp65504P2492S));
   	}
         int localIp65504P2492LCounter = -1;
         public boolean isIp65504P2492LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2492LCounter != sharedCounter;
            localIp65504P2492LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2492_L_LEN = 2;
  	/**
	 * serializeIp65504P2492L
	 */
	protected void serializeIp65504P2492L(short ip65504P2492L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2492L,IP_65504_P_2492_L_LEN)
                  ,beginIp65504P2492L
                  ,IP_65504_P_2492_L_LEN
                 );
            localIp65504P2492LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2492LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2492L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2492L() {	 
			return (getShort(beginIp65504P2492L));
   	}
         int localIp65504P2493SCounter = -1;
         public boolean isIp65504P2493SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2493SCounter != sharedCounter;
            localIp65504P2493SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2493_S_LEN = 2;
  	/**
	 * serializeIp65504P2493S
	 */
	protected void serializeIp65504P2493S(short ip65504P2493S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2493S,IP_65504_P_2493_S_LEN)
                  ,beginIp65504P2493S
                  ,IP_65504_P_2493_S_LEN
                 );
            localIp65504P2493SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2493SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2493S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2493S() {	 
			return (getShort(beginIp65504P2493S));
   	}
         int localIp65504P2493LCounter = -1;
         public boolean isIp65504P2493LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2493LCounter != sharedCounter;
            localIp65504P2493LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2493_L_LEN = 2;
  	/**
	 * serializeIp65504P2493L
	 */
	protected void serializeIp65504P2493L(short ip65504P2493L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2493L,IP_65504_P_2493_L_LEN)
                  ,beginIp65504P2493L
                  ,IP_65504_P_2493_L_LEN
                 );
            localIp65504P2493LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2493LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2493L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2493L() {	 
			return (getShort(beginIp65504P2493L));
   	}
         int localIp65504P2494SCounter = -1;
         public boolean isIp65504P2494SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2494SCounter != sharedCounter;
            localIp65504P2494SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2494_S_LEN = 2;
  	/**
	 * serializeIp65504P2494S
	 */
	protected void serializeIp65504P2494S(short ip65504P2494S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2494S,IP_65504_P_2494_S_LEN)
                  ,beginIp65504P2494S
                  ,IP_65504_P_2494_S_LEN
                 );
            localIp65504P2494SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2494SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2494S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2494S() {	 
			return (getShort(beginIp65504P2494S));
   	}
         int localIp65504P2494LCounter = -1;
         public boolean isIp65504P2494LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2494LCounter != sharedCounter;
            localIp65504P2494LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2494_L_LEN = 2;
  	/**
	 * serializeIp65504P2494L
	 */
	protected void serializeIp65504P2494L(short ip65504P2494L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2494L,IP_65504_P_2494_L_LEN)
                  ,beginIp65504P2494L
                  ,IP_65504_P_2494_L_LEN
                 );
            localIp65504P2494LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2494LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2494L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2494L() {	 
			return (getShort(beginIp65504P2494L));
   	}
         int localIp65504P2495SCounter = -1;
         public boolean isIp65504P2495SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2495SCounter != sharedCounter;
            localIp65504P2495SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2495_S_LEN = 2;
  	/**
	 * serializeIp65504P2495S
	 */
	protected void serializeIp65504P2495S(short ip65504P2495S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2495S,IP_65504_P_2495_S_LEN)
                  ,beginIp65504P2495S
                  ,IP_65504_P_2495_S_LEN
                 );
            localIp65504P2495SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2495SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2495S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2495S() {	 
			return (getShort(beginIp65504P2495S));
   	}
         int localIp65504P2495LCounter = -1;
         public boolean isIp65504P2495LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2495LCounter != sharedCounter;
            localIp65504P2495LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2495_L_LEN = 2;
  	/**
	 * serializeIp65504P2495L
	 */
	protected void serializeIp65504P2495L(short ip65504P2495L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2495L,IP_65504_P_2495_L_LEN)
                  ,beginIp65504P2495L
                  ,IP_65504_P_2495_L_LEN
                 );
            localIp65504P2495LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2495LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2495L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2495L() {	 
			return (getShort(beginIp65504P2495L));
   	}
         int localIp65504P2496SCounter = -1;
         public boolean isIp65504P2496SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2496SCounter != sharedCounter;
            localIp65504P2496SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2496_S_LEN = 2;
  	/**
	 * serializeIp65504P2496S
	 */
	protected void serializeIp65504P2496S(short ip65504P2496S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2496S,IP_65504_P_2496_S_LEN)
                  ,beginIp65504P2496S
                  ,IP_65504_P_2496_S_LEN
                 );
            localIp65504P2496SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2496SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2496S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2496S() {	 
			return (getShort(beginIp65504P2496S));
   	}
         int localIp65504P2496LCounter = -1;
         public boolean isIp65504P2496LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2496LCounter != sharedCounter;
            localIp65504P2496LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2496_L_LEN = 2;
  	/**
	 * serializeIp65504P2496L
	 */
	protected void serializeIp65504P2496L(short ip65504P2496L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2496L,IP_65504_P_2496_L_LEN)
                  ,beginIp65504P2496L
                  ,IP_65504_P_2496_L_LEN
                 );
            localIp65504P2496LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2496LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2496L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2496L() {	 
			return (getShort(beginIp65504P2496L));
   	}
         int localIp65504P2497SCounter = -1;
         public boolean isIp65504P2497SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2497SCounter != sharedCounter;
            localIp65504P2497SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2497_S_LEN = 2;
  	/**
	 * serializeIp65504P2497S
	 */
	protected void serializeIp65504P2497S(short ip65504P2497S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2497S,IP_65504_P_2497_S_LEN)
                  ,beginIp65504P2497S
                  ,IP_65504_P_2497_S_LEN
                 );
            localIp65504P2497SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2497SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2497S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2497S() {	 
			return (getShort(beginIp65504P2497S));
   	}
         int localIp65504P2497LCounter = -1;
         public boolean isIp65504P2497LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2497LCounter != sharedCounter;
            localIp65504P2497LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2497_L_LEN = 2;
  	/**
	 * serializeIp65504P2497L
	 */
	protected void serializeIp65504P2497L(short ip65504P2497L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2497L,IP_65504_P_2497_L_LEN)
                  ,beginIp65504P2497L
                  ,IP_65504_P_2497_L_LEN
                 );
            localIp65504P2497LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2497LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2497L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2497L() {	 
			return (getShort(beginIp65504P2497L));
   	}
         int localIp65504P2498SCounter = -1;
         public boolean isIp65504P2498SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2498SCounter != sharedCounter;
            localIp65504P2498SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2498_S_LEN = 2;
  	/**
	 * serializeIp65504P2498S
	 */
	protected void serializeIp65504P2498S(short ip65504P2498S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2498S,IP_65504_P_2498_S_LEN)
                  ,beginIp65504P2498S
                  ,IP_65504_P_2498_S_LEN
                 );
            localIp65504P2498SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2498SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2498S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2498S() {	 
			return (getShort(beginIp65504P2498S));
   	}
         int localIp65504P2498LCounter = -1;
         public boolean isIp65504P2498LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2498LCounter != sharedCounter;
            localIp65504P2498LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2498_L_LEN = 2;
  	/**
	 * serializeIp65504P2498L
	 */
	protected void serializeIp65504P2498L(short ip65504P2498L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2498L,IP_65504_P_2498_L_LEN)
                  ,beginIp65504P2498L
                  ,IP_65504_P_2498_L_LEN
                 );
            localIp65504P2498LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2498LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2498L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2498L() {	 
			return (getShort(beginIp65504P2498L));
   	}
         int localIp65504P2499SCounter = -1;
         public boolean isIp65504P2499SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2499SCounter != sharedCounter;
            localIp65504P2499SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2499_S_LEN = 2;
  	/**
	 * serializeIp65504P2499S
	 */
	protected void serializeIp65504P2499S(short ip65504P2499S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2499S,IP_65504_P_2499_S_LEN)
                  ,beginIp65504P2499S
                  ,IP_65504_P_2499_S_LEN
                 );
            localIp65504P2499SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2499SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2499S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2499S() {	 
			return (getShort(beginIp65504P2499S));
   	}
         int localIp65504P2499LCounter = -1;
         public boolean isIp65504P2499LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2499LCounter != sharedCounter;
            localIp65504P2499LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2499_L_LEN = 2;
  	/**
	 * serializeIp65504P2499L
	 */
	protected void serializeIp65504P2499L(short ip65504P2499L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2499L,IP_65504_P_2499_L_LEN)
                  ,beginIp65504P2499L
                  ,IP_65504_P_2499_L_LEN
                 );
            localIp65504P2499LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2499LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2499L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2499L() {	 
			return (getShort(beginIp65504P2499L));
   	}
         int localIp65504P2500SCounter = -1;
         public boolean isIp65504P2500SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2500SCounter != sharedCounter;
            localIp65504P2500SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2500_S_LEN = 2;
  	/**
	 * serializeIp65504P2500S
	 */
	protected void serializeIp65504P2500S(short ip65504P2500S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2500S,IP_65504_P_2500_S_LEN)
                  ,beginIp65504P2500S
                  ,IP_65504_P_2500_S_LEN
                 );
            localIp65504P2500SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2500SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2500S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2500S() {	 
			return (getShort(beginIp65504P2500S));
   	}
         int localIp65504P2500LCounter = -1;
         public boolean isIp65504P2500LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2500LCounter != sharedCounter;
            localIp65504P2500LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2500_L_LEN = 2;
  	/**
	 * serializeIp65504P2500L
	 */
	protected void serializeIp65504P2500L(short ip65504P2500L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2500L,IP_65504_P_2500_L_LEN)
                  ,beginIp65504P2500L
                  ,IP_65504_P_2500_L_LEN
                 );
            localIp65504P2500LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2500LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2500L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2500L() {	 
			return (getShort(beginIp65504P2500L));
   	}
         int localIp65504P2501SCounter = -1;
         public boolean isIp65504P2501SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2501SCounter != sharedCounter;
            localIp65504P2501SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2501_S_LEN = 2;
  	/**
	 * serializeIp65504P2501S
	 */
	protected void serializeIp65504P2501S(short ip65504P2501S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2501S,IP_65504_P_2501_S_LEN)
                  ,beginIp65504P2501S
                  ,IP_65504_P_2501_S_LEN
                 );
            localIp65504P2501SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2501SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2501S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2501S() {	 
			return (getShort(beginIp65504P2501S));
   	}
         int localIp65504P2501LCounter = -1;
         public boolean isIp65504P2501LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2501LCounter != sharedCounter;
            localIp65504P2501LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2501_L_LEN = 2;
  	/**
	 * serializeIp65504P2501L
	 */
	protected void serializeIp65504P2501L(short ip65504P2501L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2501L,IP_65504_P_2501_L_LEN)
                  ,beginIp65504P2501L
                  ,IP_65504_P_2501_L_LEN
                 );
            localIp65504P2501LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2501LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2501L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2501L() {	 
			return (getShort(beginIp65504P2501L));
   	}
         int localIp65504P2502SCounter = -1;
         public boolean isIp65504P2502SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2502SCounter != sharedCounter;
            localIp65504P2502SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2502_S_LEN = 2;
  	/**
	 * serializeIp65504P2502S
	 */
	protected void serializeIp65504P2502S(short ip65504P2502S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2502S,IP_65504_P_2502_S_LEN)
                  ,beginIp65504P2502S
                  ,IP_65504_P_2502_S_LEN
                 );
            localIp65504P2502SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2502SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2502S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2502S() {	 
			return (getShort(beginIp65504P2502S));
   	}
         int localIp65504P2502LCounter = -1;
         public boolean isIp65504P2502LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2502LCounter != sharedCounter;
            localIp65504P2502LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2502_L_LEN = 2;
  	/**
	 * serializeIp65504P2502L
	 */
	protected void serializeIp65504P2502L(short ip65504P2502L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2502L,IP_65504_P_2502_L_LEN)
                  ,beginIp65504P2502L
                  ,IP_65504_P_2502_L_LEN
                 );
            localIp65504P2502LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2502LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2502L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2502L() {	 
			return (getShort(beginIp65504P2502L));
   	}
         int localIp65504P2503SCounter = -1;
         public boolean isIp65504P2503SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2503SCounter != sharedCounter;
            localIp65504P2503SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2503_S_LEN = 2;
  	/**
	 * serializeIp65504P2503S
	 */
	protected void serializeIp65504P2503S(short ip65504P2503S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2503S,IP_65504_P_2503_S_LEN)
                  ,beginIp65504P2503S
                  ,IP_65504_P_2503_S_LEN
                 );
            localIp65504P2503SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2503SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2503S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2503S() {	 
			return (getShort(beginIp65504P2503S));
   	}
         int localIp65504P2503LCounter = -1;
         public boolean isIp65504P2503LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2503LCounter != sharedCounter;
            localIp65504P2503LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2503_L_LEN = 2;
  	/**
	 * serializeIp65504P2503L
	 */
	protected void serializeIp65504P2503L(short ip65504P2503L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2503L,IP_65504_P_2503_L_LEN)
                  ,beginIp65504P2503L
                  ,IP_65504_P_2503_L_LEN
                 );
            localIp65504P2503LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2503LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2503L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2503L() {	 
			return (getShort(beginIp65504P2503L));
   	}
         int localIp65504P2504SCounter = -1;
         public boolean isIp65504P2504SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2504SCounter != sharedCounter;
            localIp65504P2504SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2504_S_LEN = 2;
  	/**
	 * serializeIp65504P2504S
	 */
	protected void serializeIp65504P2504S(short ip65504P2504S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2504S,IP_65504_P_2504_S_LEN)
                  ,beginIp65504P2504S
                  ,IP_65504_P_2504_S_LEN
                 );
            localIp65504P2504SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2504SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2504S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2504S() {	 
			return (getShort(beginIp65504P2504S));
   	}
         int localIp65504P2504LCounter = -1;
         public boolean isIp65504P2504LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2504LCounter != sharedCounter;
            localIp65504P2504LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2504_L_LEN = 2;
  	/**
	 * serializeIp65504P2504L
	 */
	protected void serializeIp65504P2504L(short ip65504P2504L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2504L,IP_65504_P_2504_L_LEN)
                  ,beginIp65504P2504L
                  ,IP_65504_P_2504_L_LEN
                 );
            localIp65504P2504LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2504LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2504L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2504L() {	 
			return (getShort(beginIp65504P2504L));
   	}
         int localIp65504P2505SCounter = -1;
         public boolean isIp65504P2505SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2505SCounter != sharedCounter;
            localIp65504P2505SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2505_S_LEN = 2;
  	/**
	 * serializeIp65504P2505S
	 */
	protected void serializeIp65504P2505S(short ip65504P2505S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2505S,IP_65504_P_2505_S_LEN)
                  ,beginIp65504P2505S
                  ,IP_65504_P_2505_S_LEN
                 );
            localIp65504P2505SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2505SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2505S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2505S() {	 
			return (getShort(beginIp65504P2505S));
   	}
         int localIp65504P2505LCounter = -1;
         public boolean isIp65504P2505LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2505LCounter != sharedCounter;
            localIp65504P2505LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2505_L_LEN = 2;
  	/**
	 * serializeIp65504P2505L
	 */
	protected void serializeIp65504P2505L(short ip65504P2505L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2505L,IP_65504_P_2505_L_LEN)
                  ,beginIp65504P2505L
                  ,IP_65504_P_2505_L_LEN
                 );
            localIp65504P2505LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2505LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2505L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2505L() {	 
			return (getShort(beginIp65504P2505L));
   	}
         int localIp65504P2506SCounter = -1;
         public boolean isIp65504P2506SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2506SCounter != sharedCounter;
            localIp65504P2506SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2506_S_LEN = 2;
  	/**
	 * serializeIp65504P2506S
	 */
	protected void serializeIp65504P2506S(short ip65504P2506S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2506S,IP_65504_P_2506_S_LEN)
                  ,beginIp65504P2506S
                  ,IP_65504_P_2506_S_LEN
                 );
            localIp65504P2506SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2506SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2506S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2506S() {	 
			return (getShort(beginIp65504P2506S));
   	}
         int localIp65504P2506LCounter = -1;
         public boolean isIp65504P2506LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2506LCounter != sharedCounter;
            localIp65504P2506LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2506_L_LEN = 2;
  	/**
	 * serializeIp65504P2506L
	 */
	protected void serializeIp65504P2506L(short ip65504P2506L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2506L,IP_65504_P_2506_L_LEN)
                  ,beginIp65504P2506L
                  ,IP_65504_P_2506_L_LEN
                 );
            localIp65504P2506LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2506LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2506L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2506L() {	 
			return (getShort(beginIp65504P2506L));
   	}
         int localIp65504P2507SCounter = -1;
         public boolean isIp65504P2507SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2507SCounter != sharedCounter;
            localIp65504P2507SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2507_S_LEN = 2;
  	/**
	 * serializeIp65504P2507S
	 */
	protected void serializeIp65504P2507S(short ip65504P2507S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2507S,IP_65504_P_2507_S_LEN)
                  ,beginIp65504P2507S
                  ,IP_65504_P_2507_S_LEN
                 );
            localIp65504P2507SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2507SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2507S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2507S() {	 
			return (getShort(beginIp65504P2507S));
   	}
         int localIp65504P2507LCounter = -1;
         public boolean isIp65504P2507LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2507LCounter != sharedCounter;
            localIp65504P2507LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2507_L_LEN = 2;
  	/**
	 * serializeIp65504P2507L
	 */
	protected void serializeIp65504P2507L(short ip65504P2507L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2507L,IP_65504_P_2507_L_LEN)
                  ,beginIp65504P2507L
                  ,IP_65504_P_2507_L_LEN
                 );
            localIp65504P2507LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2507LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2507L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2507L() {	 
			return (getShort(beginIp65504P2507L));
   	}
         int localIp65504P2508SCounter = -1;
         public boolean isIp65504P2508SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2508SCounter != sharedCounter;
            localIp65504P2508SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2508_S_LEN = 2;
  	/**
	 * serializeIp65504P2508S
	 */
	protected void serializeIp65504P2508S(short ip65504P2508S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2508S,IP_65504_P_2508_S_LEN)
                  ,beginIp65504P2508S
                  ,IP_65504_P_2508_S_LEN
                 );
            localIp65504P2508SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2508SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2508S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2508S() {	 
			return (getShort(beginIp65504P2508S));
   	}
         int localIp65504P2508LCounter = -1;
         public boolean isIp65504P2508LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2508LCounter != sharedCounter;
            localIp65504P2508LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2508_L_LEN = 2;
  	/**
	 * serializeIp65504P2508L
	 */
	protected void serializeIp65504P2508L(short ip65504P2508L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2508L,IP_65504_P_2508_L_LEN)
                  ,beginIp65504P2508L
                  ,IP_65504_P_2508_L_LEN
                 );
            localIp65504P2508LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2508LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2508L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2508L() {	 
			return (getShort(beginIp65504P2508L));
   	}
         int localIp65504P2509SCounter = -1;
         public boolean isIp65504P2509SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2509SCounter != sharedCounter;
            localIp65504P2509SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2509_S_LEN = 2;
  	/**
	 * serializeIp65504P2509S
	 */
	protected void serializeIp65504P2509S(short ip65504P2509S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2509S,IP_65504_P_2509_S_LEN)
                  ,beginIp65504P2509S
                  ,IP_65504_P_2509_S_LEN
                 );
            localIp65504P2509SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2509SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2509S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2509S() {	 
			return (getShort(beginIp65504P2509S));
   	}
         int localIp65504P2509LCounter = -1;
         public boolean isIp65504P2509LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2509LCounter != sharedCounter;
            localIp65504P2509LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2509_L_LEN = 2;
  	/**
	 * serializeIp65504P2509L
	 */
	protected void serializeIp65504P2509L(short ip65504P2509L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2509L,IP_65504_P_2509_L_LEN)
                  ,beginIp65504P2509L
                  ,IP_65504_P_2509_L_LEN
                 );
            localIp65504P2509LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2509LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2509L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2509L() {	 
			return (getShort(beginIp65504P2509L));
   	}
         int localIp65504P2510SCounter = -1;
         public boolean isIp65504P2510SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2510SCounter != sharedCounter;
            localIp65504P2510SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2510_S_LEN = 2;
  	/**
	 * serializeIp65504P2510S
	 */
	protected void serializeIp65504P2510S(short ip65504P2510S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2510S,IP_65504_P_2510_S_LEN)
                  ,beginIp65504P2510S
                  ,IP_65504_P_2510_S_LEN
                 );
            localIp65504P2510SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2510SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2510S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2510S() {	 
			return (getShort(beginIp65504P2510S));
   	}
         int localIp65504P2510LCounter = -1;
         public boolean isIp65504P2510LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2510LCounter != sharedCounter;
            localIp65504P2510LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2510_L_LEN = 2;
  	/**
	 * serializeIp65504P2510L
	 */
	protected void serializeIp65504P2510L(short ip65504P2510L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2510L,IP_65504_P_2510_L_LEN)
                  ,beginIp65504P2510L
                  ,IP_65504_P_2510_L_LEN
                 );
            localIp65504P2510LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2510LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2510L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2510L() {	 
			return (getShort(beginIp65504P2510L));
   	}
         int localIp65504P2511SCounter = -1;
         public boolean isIp65504P2511SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2511SCounter != sharedCounter;
            localIp65504P2511SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2511_S_LEN = 2;
  	/**
	 * serializeIp65504P2511S
	 */
	protected void serializeIp65504P2511S(short ip65504P2511S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2511S,IP_65504_P_2511_S_LEN)
                  ,beginIp65504P2511S
                  ,IP_65504_P_2511_S_LEN
                 );
            localIp65504P2511SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2511SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2511S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2511S() {	 
			return (getShort(beginIp65504P2511S));
   	}
         int localIp65504P2511LCounter = -1;
         public boolean isIp65504P2511LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2511LCounter != sharedCounter;
            localIp65504P2511LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2511_L_LEN = 2;
  	/**
	 * serializeIp65504P2511L
	 */
	protected void serializeIp65504P2511L(short ip65504P2511L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2511L,IP_65504_P_2511_L_LEN)
                  ,beginIp65504P2511L
                  ,IP_65504_P_2511_L_LEN
                 );
            localIp65504P2511LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2511LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2511L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2511L() {	 
			return (getShort(beginIp65504P2511L));
   	}




}
  
