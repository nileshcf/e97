package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup90Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:24. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup90Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup90Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_90_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2760S;
            protected  int beginIp65504P2760L;
            protected  int beginIp65504P2761S;
            protected  int beginIp65504P2761L;
            protected  int beginIp65504P2762S;
            protected  int beginIp65504P2762L;
            protected  int beginIp65504P2763S;
            protected  int beginIp65504P2763L;
            protected  int beginIp65504P2764S;
            protected  int beginIp65504P2764L;
            protected  int beginIp65504P2765S;
            protected  int beginIp65504P2765L;
            protected  int beginIp65504P2766S;
            protected  int beginIp65504P2766L;
            protected  int beginIp65504P2767S;
            protected  int beginIp65504P2767L;
            protected  int beginIp65504P2768S;
            protected  int beginIp65504P2768L;
            protected  int beginIp65504P2769S;
            protected  int beginIp65504P2769L;
            protected  int beginIp65504P2770S;
            protected  int beginIp65504P2770L;
            protected  int beginIp65504P2771S;
            protected  int beginIp65504P2771L;
            protected  int beginIp65504P2772S;
            protected  int beginIp65504P2772L;
            protected  int beginIp65504P2773S;
            protected  int beginIp65504P2773L;
            protected  int beginIp65504P2774S;
            protected  int beginIp65504P2774L;
            protected  int beginIp65504P2775S;
            protected  int beginIp65504P2775L;
            protected  int beginIp65504P2776S;
            protected  int beginIp65504P2776L;
            protected  int beginIp65504P2777S;
            protected  int beginIp65504P2777L;
            protected  int beginIp65504P2778S;
            protected  int beginIp65504P2778L;
            protected  int beginIp65504P2779S;
            protected  int beginIp65504P2779L;
            protected  int beginIp65504P2780S;
            protected  int beginIp65504P2780L;
            protected  int beginIp65504P2781S;
            protected  int beginIp65504P2781L;
            protected  int beginIp65504P2782S;
            protected  int beginIp65504P2782L;
            protected  int beginIp65504P2783S;
            protected  int beginIp65504P2783L;
            protected  int beginIp65504P2784S;
            protected  int beginIp65504P2784L;
            protected  int beginIp65504P2785S;
            protected  int beginIp65504P2785L;
            protected  int beginIp65504P2786S;
            protected  int beginIp65504P2786L;
            protected  int beginIp65504P2787S;
            protected  int beginIp65504P2787L;
            protected  int beginIp65504P2788S;
            protected  int beginIp65504P2788L;
            protected  int beginIp65504P2789S;
            protected  int beginIp65504P2789L;
            protected  int beginIp65504P2790S;
            protected  int beginIp65504P2790L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup90Serialized
	**/
    public Ip65504PdsNamesLargeGroup90Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup90Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup90Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup90Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,22068); // serialize this field at offset 22068 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup90Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 22068 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup90Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_90_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2760S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2760L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2761S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2761L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2762S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2762L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2763S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2763L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2764S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2764L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2765S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2765L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2766S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2766L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2767S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2767L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2768S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2768L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2769S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2769L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2770S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2770L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2771S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2771L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2772S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2772L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2773S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2773L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2774S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2774L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2775S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2775L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2776S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2776L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2777S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2777L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2778S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2778L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2779S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2779L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2780S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2780L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2781S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2781L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2782S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2782L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2783S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2783L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2784S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2784L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2785S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2785L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2786S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2786L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2787S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2787L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2788S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2788L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2789S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2789L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2790S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2790L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2760SCounter = -1;
         public boolean isIp65504P2760SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2760SCounter != sharedCounter;
            localIp65504P2760SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2760_S_LEN = 2;
  	/**
	 * serializeIp65504P2760S
	 */
	protected void serializeIp65504P2760S(short ip65504P2760S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2760S,IP_65504_P_2760_S_LEN)
                  ,beginIp65504P2760S
                  ,IP_65504_P_2760_S_LEN
                 );
            localIp65504P2760SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2760SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2760S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2760S() {	 
			return (getShort(beginIp65504P2760S));
   	}
         int localIp65504P2760LCounter = -1;
         public boolean isIp65504P2760LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2760LCounter != sharedCounter;
            localIp65504P2760LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2760_L_LEN = 2;
  	/**
	 * serializeIp65504P2760L
	 */
	protected void serializeIp65504P2760L(short ip65504P2760L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2760L,IP_65504_P_2760_L_LEN)
                  ,beginIp65504P2760L
                  ,IP_65504_P_2760_L_LEN
                 );
            localIp65504P2760LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2760LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2760L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2760L() {	 
			return (getShort(beginIp65504P2760L));
   	}
         int localIp65504P2761SCounter = -1;
         public boolean isIp65504P2761SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2761SCounter != sharedCounter;
            localIp65504P2761SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2761_S_LEN = 2;
  	/**
	 * serializeIp65504P2761S
	 */
	protected void serializeIp65504P2761S(short ip65504P2761S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2761S,IP_65504_P_2761_S_LEN)
                  ,beginIp65504P2761S
                  ,IP_65504_P_2761_S_LEN
                 );
            localIp65504P2761SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2761SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2761S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2761S() {	 
			return (getShort(beginIp65504P2761S));
   	}
         int localIp65504P2761LCounter = -1;
         public boolean isIp65504P2761LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2761LCounter != sharedCounter;
            localIp65504P2761LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2761_L_LEN = 2;
  	/**
	 * serializeIp65504P2761L
	 */
	protected void serializeIp65504P2761L(short ip65504P2761L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2761L,IP_65504_P_2761_L_LEN)
                  ,beginIp65504P2761L
                  ,IP_65504_P_2761_L_LEN
                 );
            localIp65504P2761LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2761LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2761L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2761L() {	 
			return (getShort(beginIp65504P2761L));
   	}
         int localIp65504P2762SCounter = -1;
         public boolean isIp65504P2762SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2762SCounter != sharedCounter;
            localIp65504P2762SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2762_S_LEN = 2;
  	/**
	 * serializeIp65504P2762S
	 */
	protected void serializeIp65504P2762S(short ip65504P2762S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2762S,IP_65504_P_2762_S_LEN)
                  ,beginIp65504P2762S
                  ,IP_65504_P_2762_S_LEN
                 );
            localIp65504P2762SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2762SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2762S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2762S() {	 
			return (getShort(beginIp65504P2762S));
   	}
         int localIp65504P2762LCounter = -1;
         public boolean isIp65504P2762LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2762LCounter != sharedCounter;
            localIp65504P2762LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2762_L_LEN = 2;
  	/**
	 * serializeIp65504P2762L
	 */
	protected void serializeIp65504P2762L(short ip65504P2762L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2762L,IP_65504_P_2762_L_LEN)
                  ,beginIp65504P2762L
                  ,IP_65504_P_2762_L_LEN
                 );
            localIp65504P2762LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2762LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2762L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2762L() {	 
			return (getShort(beginIp65504P2762L));
   	}
         int localIp65504P2763SCounter = -1;
         public boolean isIp65504P2763SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2763SCounter != sharedCounter;
            localIp65504P2763SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2763_S_LEN = 2;
  	/**
	 * serializeIp65504P2763S
	 */
	protected void serializeIp65504P2763S(short ip65504P2763S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2763S,IP_65504_P_2763_S_LEN)
                  ,beginIp65504P2763S
                  ,IP_65504_P_2763_S_LEN
                 );
            localIp65504P2763SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2763SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2763S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2763S() {	 
			return (getShort(beginIp65504P2763S));
   	}
         int localIp65504P2763LCounter = -1;
         public boolean isIp65504P2763LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2763LCounter != sharedCounter;
            localIp65504P2763LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2763_L_LEN = 2;
  	/**
	 * serializeIp65504P2763L
	 */
	protected void serializeIp65504P2763L(short ip65504P2763L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2763L,IP_65504_P_2763_L_LEN)
                  ,beginIp65504P2763L
                  ,IP_65504_P_2763_L_LEN
                 );
            localIp65504P2763LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2763LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2763L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2763L() {	 
			return (getShort(beginIp65504P2763L));
   	}
         int localIp65504P2764SCounter = -1;
         public boolean isIp65504P2764SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2764SCounter != sharedCounter;
            localIp65504P2764SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2764_S_LEN = 2;
  	/**
	 * serializeIp65504P2764S
	 */
	protected void serializeIp65504P2764S(short ip65504P2764S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2764S,IP_65504_P_2764_S_LEN)
                  ,beginIp65504P2764S
                  ,IP_65504_P_2764_S_LEN
                 );
            localIp65504P2764SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2764SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2764S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2764S() {	 
			return (getShort(beginIp65504P2764S));
   	}
         int localIp65504P2764LCounter = -1;
         public boolean isIp65504P2764LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2764LCounter != sharedCounter;
            localIp65504P2764LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2764_L_LEN = 2;
  	/**
	 * serializeIp65504P2764L
	 */
	protected void serializeIp65504P2764L(short ip65504P2764L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2764L,IP_65504_P_2764_L_LEN)
                  ,beginIp65504P2764L
                  ,IP_65504_P_2764_L_LEN
                 );
            localIp65504P2764LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2764LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2764L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2764L() {	 
			return (getShort(beginIp65504P2764L));
   	}
         int localIp65504P2765SCounter = -1;
         public boolean isIp65504P2765SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2765SCounter != sharedCounter;
            localIp65504P2765SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2765_S_LEN = 2;
  	/**
	 * serializeIp65504P2765S
	 */
	protected void serializeIp65504P2765S(short ip65504P2765S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2765S,IP_65504_P_2765_S_LEN)
                  ,beginIp65504P2765S
                  ,IP_65504_P_2765_S_LEN
                 );
            localIp65504P2765SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2765SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2765S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2765S() {	 
			return (getShort(beginIp65504P2765S));
   	}
         int localIp65504P2765LCounter = -1;
         public boolean isIp65504P2765LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2765LCounter != sharedCounter;
            localIp65504P2765LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2765_L_LEN = 2;
  	/**
	 * serializeIp65504P2765L
	 */
	protected void serializeIp65504P2765L(short ip65504P2765L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2765L,IP_65504_P_2765_L_LEN)
                  ,beginIp65504P2765L
                  ,IP_65504_P_2765_L_LEN
                 );
            localIp65504P2765LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2765LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2765L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2765L() {	 
			return (getShort(beginIp65504P2765L));
   	}
         int localIp65504P2766SCounter = -1;
         public boolean isIp65504P2766SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2766SCounter != sharedCounter;
            localIp65504P2766SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2766_S_LEN = 2;
  	/**
	 * serializeIp65504P2766S
	 */
	protected void serializeIp65504P2766S(short ip65504P2766S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2766S,IP_65504_P_2766_S_LEN)
                  ,beginIp65504P2766S
                  ,IP_65504_P_2766_S_LEN
                 );
            localIp65504P2766SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2766SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2766S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2766S() {	 
			return (getShort(beginIp65504P2766S));
   	}
         int localIp65504P2766LCounter = -1;
         public boolean isIp65504P2766LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2766LCounter != sharedCounter;
            localIp65504P2766LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2766_L_LEN = 2;
  	/**
	 * serializeIp65504P2766L
	 */
	protected void serializeIp65504P2766L(short ip65504P2766L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2766L,IP_65504_P_2766_L_LEN)
                  ,beginIp65504P2766L
                  ,IP_65504_P_2766_L_LEN
                 );
            localIp65504P2766LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2766LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2766L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2766L() {	 
			return (getShort(beginIp65504P2766L));
   	}
         int localIp65504P2767SCounter = -1;
         public boolean isIp65504P2767SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2767SCounter != sharedCounter;
            localIp65504P2767SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2767_S_LEN = 2;
  	/**
	 * serializeIp65504P2767S
	 */
	protected void serializeIp65504P2767S(short ip65504P2767S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2767S,IP_65504_P_2767_S_LEN)
                  ,beginIp65504P2767S
                  ,IP_65504_P_2767_S_LEN
                 );
            localIp65504P2767SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2767SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2767S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2767S() {	 
			return (getShort(beginIp65504P2767S));
   	}
         int localIp65504P2767LCounter = -1;
         public boolean isIp65504P2767LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2767LCounter != sharedCounter;
            localIp65504P2767LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2767_L_LEN = 2;
  	/**
	 * serializeIp65504P2767L
	 */
	protected void serializeIp65504P2767L(short ip65504P2767L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2767L,IP_65504_P_2767_L_LEN)
                  ,beginIp65504P2767L
                  ,IP_65504_P_2767_L_LEN
                 );
            localIp65504P2767LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2767LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2767L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2767L() {	 
			return (getShort(beginIp65504P2767L));
   	}
         int localIp65504P2768SCounter = -1;
         public boolean isIp65504P2768SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2768SCounter != sharedCounter;
            localIp65504P2768SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2768_S_LEN = 2;
  	/**
	 * serializeIp65504P2768S
	 */
	protected void serializeIp65504P2768S(short ip65504P2768S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2768S,IP_65504_P_2768_S_LEN)
                  ,beginIp65504P2768S
                  ,IP_65504_P_2768_S_LEN
                 );
            localIp65504P2768SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2768SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2768S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2768S() {	 
			return (getShort(beginIp65504P2768S));
   	}
         int localIp65504P2768LCounter = -1;
         public boolean isIp65504P2768LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2768LCounter != sharedCounter;
            localIp65504P2768LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2768_L_LEN = 2;
  	/**
	 * serializeIp65504P2768L
	 */
	protected void serializeIp65504P2768L(short ip65504P2768L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2768L,IP_65504_P_2768_L_LEN)
                  ,beginIp65504P2768L
                  ,IP_65504_P_2768_L_LEN
                 );
            localIp65504P2768LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2768LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2768L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2768L() {	 
			return (getShort(beginIp65504P2768L));
   	}
         int localIp65504P2769SCounter = -1;
         public boolean isIp65504P2769SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2769SCounter != sharedCounter;
            localIp65504P2769SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2769_S_LEN = 2;
  	/**
	 * serializeIp65504P2769S
	 */
	protected void serializeIp65504P2769S(short ip65504P2769S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2769S,IP_65504_P_2769_S_LEN)
                  ,beginIp65504P2769S
                  ,IP_65504_P_2769_S_LEN
                 );
            localIp65504P2769SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2769SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2769S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2769S() {	 
			return (getShort(beginIp65504P2769S));
   	}
         int localIp65504P2769LCounter = -1;
         public boolean isIp65504P2769LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2769LCounter != sharedCounter;
            localIp65504P2769LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2769_L_LEN = 2;
  	/**
	 * serializeIp65504P2769L
	 */
	protected void serializeIp65504P2769L(short ip65504P2769L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2769L,IP_65504_P_2769_L_LEN)
                  ,beginIp65504P2769L
                  ,IP_65504_P_2769_L_LEN
                 );
            localIp65504P2769LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2769LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2769L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2769L() {	 
			return (getShort(beginIp65504P2769L));
   	}
         int localIp65504P2770SCounter = -1;
         public boolean isIp65504P2770SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2770SCounter != sharedCounter;
            localIp65504P2770SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2770_S_LEN = 2;
  	/**
	 * serializeIp65504P2770S
	 */
	protected void serializeIp65504P2770S(short ip65504P2770S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2770S,IP_65504_P_2770_S_LEN)
                  ,beginIp65504P2770S
                  ,IP_65504_P_2770_S_LEN
                 );
            localIp65504P2770SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2770SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2770S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2770S() {	 
			return (getShort(beginIp65504P2770S));
   	}
         int localIp65504P2770LCounter = -1;
         public boolean isIp65504P2770LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2770LCounter != sharedCounter;
            localIp65504P2770LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2770_L_LEN = 2;
  	/**
	 * serializeIp65504P2770L
	 */
	protected void serializeIp65504P2770L(short ip65504P2770L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2770L,IP_65504_P_2770_L_LEN)
                  ,beginIp65504P2770L
                  ,IP_65504_P_2770_L_LEN
                 );
            localIp65504P2770LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2770LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2770L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2770L() {	 
			return (getShort(beginIp65504P2770L));
   	}
         int localIp65504P2771SCounter = -1;
         public boolean isIp65504P2771SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2771SCounter != sharedCounter;
            localIp65504P2771SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2771_S_LEN = 2;
  	/**
	 * serializeIp65504P2771S
	 */
	protected void serializeIp65504P2771S(short ip65504P2771S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2771S,IP_65504_P_2771_S_LEN)
                  ,beginIp65504P2771S
                  ,IP_65504_P_2771_S_LEN
                 );
            localIp65504P2771SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2771SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2771S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2771S() {	 
			return (getShort(beginIp65504P2771S));
   	}
         int localIp65504P2771LCounter = -1;
         public boolean isIp65504P2771LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2771LCounter != sharedCounter;
            localIp65504P2771LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2771_L_LEN = 2;
  	/**
	 * serializeIp65504P2771L
	 */
	protected void serializeIp65504P2771L(short ip65504P2771L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2771L,IP_65504_P_2771_L_LEN)
                  ,beginIp65504P2771L
                  ,IP_65504_P_2771_L_LEN
                 );
            localIp65504P2771LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2771LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2771L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2771L() {	 
			return (getShort(beginIp65504P2771L));
   	}
         int localIp65504P2772SCounter = -1;
         public boolean isIp65504P2772SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2772SCounter != sharedCounter;
            localIp65504P2772SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2772_S_LEN = 2;
  	/**
	 * serializeIp65504P2772S
	 */
	protected void serializeIp65504P2772S(short ip65504P2772S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2772S,IP_65504_P_2772_S_LEN)
                  ,beginIp65504P2772S
                  ,IP_65504_P_2772_S_LEN
                 );
            localIp65504P2772SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2772SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2772S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2772S() {	 
			return (getShort(beginIp65504P2772S));
   	}
         int localIp65504P2772LCounter = -1;
         public boolean isIp65504P2772LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2772LCounter != sharedCounter;
            localIp65504P2772LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2772_L_LEN = 2;
  	/**
	 * serializeIp65504P2772L
	 */
	protected void serializeIp65504P2772L(short ip65504P2772L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2772L,IP_65504_P_2772_L_LEN)
                  ,beginIp65504P2772L
                  ,IP_65504_P_2772_L_LEN
                 );
            localIp65504P2772LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2772LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2772L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2772L() {	 
			return (getShort(beginIp65504P2772L));
   	}
         int localIp65504P2773SCounter = -1;
         public boolean isIp65504P2773SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2773SCounter != sharedCounter;
            localIp65504P2773SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2773_S_LEN = 2;
  	/**
	 * serializeIp65504P2773S
	 */
	protected void serializeIp65504P2773S(short ip65504P2773S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2773S,IP_65504_P_2773_S_LEN)
                  ,beginIp65504P2773S
                  ,IP_65504_P_2773_S_LEN
                 );
            localIp65504P2773SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2773SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2773S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2773S() {	 
			return (getShort(beginIp65504P2773S));
   	}
         int localIp65504P2773LCounter = -1;
         public boolean isIp65504P2773LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2773LCounter != sharedCounter;
            localIp65504P2773LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2773_L_LEN = 2;
  	/**
	 * serializeIp65504P2773L
	 */
	protected void serializeIp65504P2773L(short ip65504P2773L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2773L,IP_65504_P_2773_L_LEN)
                  ,beginIp65504P2773L
                  ,IP_65504_P_2773_L_LEN
                 );
            localIp65504P2773LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2773LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2773L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2773L() {	 
			return (getShort(beginIp65504P2773L));
   	}
         int localIp65504P2774SCounter = -1;
         public boolean isIp65504P2774SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2774SCounter != sharedCounter;
            localIp65504P2774SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2774_S_LEN = 2;
  	/**
	 * serializeIp65504P2774S
	 */
	protected void serializeIp65504P2774S(short ip65504P2774S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2774S,IP_65504_P_2774_S_LEN)
                  ,beginIp65504P2774S
                  ,IP_65504_P_2774_S_LEN
                 );
            localIp65504P2774SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2774SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2774S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2774S() {	 
			return (getShort(beginIp65504P2774S));
   	}
         int localIp65504P2774LCounter = -1;
         public boolean isIp65504P2774LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2774LCounter != sharedCounter;
            localIp65504P2774LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2774_L_LEN = 2;
  	/**
	 * serializeIp65504P2774L
	 */
	protected void serializeIp65504P2774L(short ip65504P2774L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2774L,IP_65504_P_2774_L_LEN)
                  ,beginIp65504P2774L
                  ,IP_65504_P_2774_L_LEN
                 );
            localIp65504P2774LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2774LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2774L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2774L() {	 
			return (getShort(beginIp65504P2774L));
   	}
         int localIp65504P2775SCounter = -1;
         public boolean isIp65504P2775SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2775SCounter != sharedCounter;
            localIp65504P2775SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2775_S_LEN = 2;
  	/**
	 * serializeIp65504P2775S
	 */
	protected void serializeIp65504P2775S(short ip65504P2775S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2775S,IP_65504_P_2775_S_LEN)
                  ,beginIp65504P2775S
                  ,IP_65504_P_2775_S_LEN
                 );
            localIp65504P2775SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2775SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2775S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2775S() {	 
			return (getShort(beginIp65504P2775S));
   	}
         int localIp65504P2775LCounter = -1;
         public boolean isIp65504P2775LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2775LCounter != sharedCounter;
            localIp65504P2775LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2775_L_LEN = 2;
  	/**
	 * serializeIp65504P2775L
	 */
	protected void serializeIp65504P2775L(short ip65504P2775L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2775L,IP_65504_P_2775_L_LEN)
                  ,beginIp65504P2775L
                  ,IP_65504_P_2775_L_LEN
                 );
            localIp65504P2775LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2775LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2775L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2775L() {	 
			return (getShort(beginIp65504P2775L));
   	}
         int localIp65504P2776SCounter = -1;
         public boolean isIp65504P2776SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2776SCounter != sharedCounter;
            localIp65504P2776SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2776_S_LEN = 2;
  	/**
	 * serializeIp65504P2776S
	 */
	protected void serializeIp65504P2776S(short ip65504P2776S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2776S,IP_65504_P_2776_S_LEN)
                  ,beginIp65504P2776S
                  ,IP_65504_P_2776_S_LEN
                 );
            localIp65504P2776SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2776SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2776S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2776S() {	 
			return (getShort(beginIp65504P2776S));
   	}
         int localIp65504P2776LCounter = -1;
         public boolean isIp65504P2776LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2776LCounter != sharedCounter;
            localIp65504P2776LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2776_L_LEN = 2;
  	/**
	 * serializeIp65504P2776L
	 */
	protected void serializeIp65504P2776L(short ip65504P2776L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2776L,IP_65504_P_2776_L_LEN)
                  ,beginIp65504P2776L
                  ,IP_65504_P_2776_L_LEN
                 );
            localIp65504P2776LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2776LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2776L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2776L() {	 
			return (getShort(beginIp65504P2776L));
   	}
         int localIp65504P2777SCounter = -1;
         public boolean isIp65504P2777SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2777SCounter != sharedCounter;
            localIp65504P2777SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2777_S_LEN = 2;
  	/**
	 * serializeIp65504P2777S
	 */
	protected void serializeIp65504P2777S(short ip65504P2777S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2777S,IP_65504_P_2777_S_LEN)
                  ,beginIp65504P2777S
                  ,IP_65504_P_2777_S_LEN
                 );
            localIp65504P2777SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2777SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2777S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2777S() {	 
			return (getShort(beginIp65504P2777S));
   	}
         int localIp65504P2777LCounter = -1;
         public boolean isIp65504P2777LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2777LCounter != sharedCounter;
            localIp65504P2777LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2777_L_LEN = 2;
  	/**
	 * serializeIp65504P2777L
	 */
	protected void serializeIp65504P2777L(short ip65504P2777L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2777L,IP_65504_P_2777_L_LEN)
                  ,beginIp65504P2777L
                  ,IP_65504_P_2777_L_LEN
                 );
            localIp65504P2777LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2777LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2777L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2777L() {	 
			return (getShort(beginIp65504P2777L));
   	}
         int localIp65504P2778SCounter = -1;
         public boolean isIp65504P2778SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2778SCounter != sharedCounter;
            localIp65504P2778SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2778_S_LEN = 2;
  	/**
	 * serializeIp65504P2778S
	 */
	protected void serializeIp65504P2778S(short ip65504P2778S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2778S,IP_65504_P_2778_S_LEN)
                  ,beginIp65504P2778S
                  ,IP_65504_P_2778_S_LEN
                 );
            localIp65504P2778SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2778SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2778S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2778S() {	 
			return (getShort(beginIp65504P2778S));
   	}
         int localIp65504P2778LCounter = -1;
         public boolean isIp65504P2778LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2778LCounter != sharedCounter;
            localIp65504P2778LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2778_L_LEN = 2;
  	/**
	 * serializeIp65504P2778L
	 */
	protected void serializeIp65504P2778L(short ip65504P2778L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2778L,IP_65504_P_2778_L_LEN)
                  ,beginIp65504P2778L
                  ,IP_65504_P_2778_L_LEN
                 );
            localIp65504P2778LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2778LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2778L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2778L() {	 
			return (getShort(beginIp65504P2778L));
   	}
         int localIp65504P2779SCounter = -1;
         public boolean isIp65504P2779SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2779SCounter != sharedCounter;
            localIp65504P2779SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2779_S_LEN = 2;
  	/**
	 * serializeIp65504P2779S
	 */
	protected void serializeIp65504P2779S(short ip65504P2779S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2779S,IP_65504_P_2779_S_LEN)
                  ,beginIp65504P2779S
                  ,IP_65504_P_2779_S_LEN
                 );
            localIp65504P2779SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2779SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2779S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2779S() {	 
			return (getShort(beginIp65504P2779S));
   	}
         int localIp65504P2779LCounter = -1;
         public boolean isIp65504P2779LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2779LCounter != sharedCounter;
            localIp65504P2779LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2779_L_LEN = 2;
  	/**
	 * serializeIp65504P2779L
	 */
	protected void serializeIp65504P2779L(short ip65504P2779L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2779L,IP_65504_P_2779_L_LEN)
                  ,beginIp65504P2779L
                  ,IP_65504_P_2779_L_LEN
                 );
            localIp65504P2779LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2779LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2779L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2779L() {	 
			return (getShort(beginIp65504P2779L));
   	}
         int localIp65504P2780SCounter = -1;
         public boolean isIp65504P2780SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2780SCounter != sharedCounter;
            localIp65504P2780SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2780_S_LEN = 2;
  	/**
	 * serializeIp65504P2780S
	 */
	protected void serializeIp65504P2780S(short ip65504P2780S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2780S,IP_65504_P_2780_S_LEN)
                  ,beginIp65504P2780S
                  ,IP_65504_P_2780_S_LEN
                 );
            localIp65504P2780SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2780SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2780S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2780S() {	 
			return (getShort(beginIp65504P2780S));
   	}
         int localIp65504P2780LCounter = -1;
         public boolean isIp65504P2780LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2780LCounter != sharedCounter;
            localIp65504P2780LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2780_L_LEN = 2;
  	/**
	 * serializeIp65504P2780L
	 */
	protected void serializeIp65504P2780L(short ip65504P2780L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2780L,IP_65504_P_2780_L_LEN)
                  ,beginIp65504P2780L
                  ,IP_65504_P_2780_L_LEN
                 );
            localIp65504P2780LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2780LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2780L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2780L() {	 
			return (getShort(beginIp65504P2780L));
   	}
         int localIp65504P2781SCounter = -1;
         public boolean isIp65504P2781SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2781SCounter != sharedCounter;
            localIp65504P2781SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2781_S_LEN = 2;
  	/**
	 * serializeIp65504P2781S
	 */
	protected void serializeIp65504P2781S(short ip65504P2781S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2781S,IP_65504_P_2781_S_LEN)
                  ,beginIp65504P2781S
                  ,IP_65504_P_2781_S_LEN
                 );
            localIp65504P2781SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2781SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2781S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2781S() {	 
			return (getShort(beginIp65504P2781S));
   	}
         int localIp65504P2781LCounter = -1;
         public boolean isIp65504P2781LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2781LCounter != sharedCounter;
            localIp65504P2781LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2781_L_LEN = 2;
  	/**
	 * serializeIp65504P2781L
	 */
	protected void serializeIp65504P2781L(short ip65504P2781L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2781L,IP_65504_P_2781_L_LEN)
                  ,beginIp65504P2781L
                  ,IP_65504_P_2781_L_LEN
                 );
            localIp65504P2781LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2781LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2781L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2781L() {	 
			return (getShort(beginIp65504P2781L));
   	}
         int localIp65504P2782SCounter = -1;
         public boolean isIp65504P2782SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2782SCounter != sharedCounter;
            localIp65504P2782SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2782_S_LEN = 2;
  	/**
	 * serializeIp65504P2782S
	 */
	protected void serializeIp65504P2782S(short ip65504P2782S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2782S,IP_65504_P_2782_S_LEN)
                  ,beginIp65504P2782S
                  ,IP_65504_P_2782_S_LEN
                 );
            localIp65504P2782SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2782SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2782S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2782S() {	 
			return (getShort(beginIp65504P2782S));
   	}
         int localIp65504P2782LCounter = -1;
         public boolean isIp65504P2782LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2782LCounter != sharedCounter;
            localIp65504P2782LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2782_L_LEN = 2;
  	/**
	 * serializeIp65504P2782L
	 */
	protected void serializeIp65504P2782L(short ip65504P2782L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2782L,IP_65504_P_2782_L_LEN)
                  ,beginIp65504P2782L
                  ,IP_65504_P_2782_L_LEN
                 );
            localIp65504P2782LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2782LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2782L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2782L() {	 
			return (getShort(beginIp65504P2782L));
   	}
         int localIp65504P2783SCounter = -1;
         public boolean isIp65504P2783SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2783SCounter != sharedCounter;
            localIp65504P2783SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2783_S_LEN = 2;
  	/**
	 * serializeIp65504P2783S
	 */
	protected void serializeIp65504P2783S(short ip65504P2783S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2783S,IP_65504_P_2783_S_LEN)
                  ,beginIp65504P2783S
                  ,IP_65504_P_2783_S_LEN
                 );
            localIp65504P2783SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2783SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2783S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2783S() {	 
			return (getShort(beginIp65504P2783S));
   	}
         int localIp65504P2783LCounter = -1;
         public boolean isIp65504P2783LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2783LCounter != sharedCounter;
            localIp65504P2783LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2783_L_LEN = 2;
  	/**
	 * serializeIp65504P2783L
	 */
	protected void serializeIp65504P2783L(short ip65504P2783L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2783L,IP_65504_P_2783_L_LEN)
                  ,beginIp65504P2783L
                  ,IP_65504_P_2783_L_LEN
                 );
            localIp65504P2783LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2783LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2783L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2783L() {	 
			return (getShort(beginIp65504P2783L));
   	}
         int localIp65504P2784SCounter = -1;
         public boolean isIp65504P2784SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2784SCounter != sharedCounter;
            localIp65504P2784SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2784_S_LEN = 2;
  	/**
	 * serializeIp65504P2784S
	 */
	protected void serializeIp65504P2784S(short ip65504P2784S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2784S,IP_65504_P_2784_S_LEN)
                  ,beginIp65504P2784S
                  ,IP_65504_P_2784_S_LEN
                 );
            localIp65504P2784SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2784SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2784S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2784S() {	 
			return (getShort(beginIp65504P2784S));
   	}
         int localIp65504P2784LCounter = -1;
         public boolean isIp65504P2784LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2784LCounter != sharedCounter;
            localIp65504P2784LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2784_L_LEN = 2;
  	/**
	 * serializeIp65504P2784L
	 */
	protected void serializeIp65504P2784L(short ip65504P2784L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2784L,IP_65504_P_2784_L_LEN)
                  ,beginIp65504P2784L
                  ,IP_65504_P_2784_L_LEN
                 );
            localIp65504P2784LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2784LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2784L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2784L() {	 
			return (getShort(beginIp65504P2784L));
   	}
         int localIp65504P2785SCounter = -1;
         public boolean isIp65504P2785SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2785SCounter != sharedCounter;
            localIp65504P2785SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2785_S_LEN = 2;
  	/**
	 * serializeIp65504P2785S
	 */
	protected void serializeIp65504P2785S(short ip65504P2785S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2785S,IP_65504_P_2785_S_LEN)
                  ,beginIp65504P2785S
                  ,IP_65504_P_2785_S_LEN
                 );
            localIp65504P2785SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2785SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2785S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2785S() {	 
			return (getShort(beginIp65504P2785S));
   	}
         int localIp65504P2785LCounter = -1;
         public boolean isIp65504P2785LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2785LCounter != sharedCounter;
            localIp65504P2785LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2785_L_LEN = 2;
  	/**
	 * serializeIp65504P2785L
	 */
	protected void serializeIp65504P2785L(short ip65504P2785L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2785L,IP_65504_P_2785_L_LEN)
                  ,beginIp65504P2785L
                  ,IP_65504_P_2785_L_LEN
                 );
            localIp65504P2785LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2785LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2785L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2785L() {	 
			return (getShort(beginIp65504P2785L));
   	}
         int localIp65504P2786SCounter = -1;
         public boolean isIp65504P2786SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2786SCounter != sharedCounter;
            localIp65504P2786SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2786_S_LEN = 2;
  	/**
	 * serializeIp65504P2786S
	 */
	protected void serializeIp65504P2786S(short ip65504P2786S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2786S,IP_65504_P_2786_S_LEN)
                  ,beginIp65504P2786S
                  ,IP_65504_P_2786_S_LEN
                 );
            localIp65504P2786SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2786SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2786S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2786S() {	 
			return (getShort(beginIp65504P2786S));
   	}
         int localIp65504P2786LCounter = -1;
         public boolean isIp65504P2786LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2786LCounter != sharedCounter;
            localIp65504P2786LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2786_L_LEN = 2;
  	/**
	 * serializeIp65504P2786L
	 */
	protected void serializeIp65504P2786L(short ip65504P2786L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2786L,IP_65504_P_2786_L_LEN)
                  ,beginIp65504P2786L
                  ,IP_65504_P_2786_L_LEN
                 );
            localIp65504P2786LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2786LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2786L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2786L() {	 
			return (getShort(beginIp65504P2786L));
   	}
         int localIp65504P2787SCounter = -1;
         public boolean isIp65504P2787SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2787SCounter != sharedCounter;
            localIp65504P2787SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2787_S_LEN = 2;
  	/**
	 * serializeIp65504P2787S
	 */
	protected void serializeIp65504P2787S(short ip65504P2787S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2787S,IP_65504_P_2787_S_LEN)
                  ,beginIp65504P2787S
                  ,IP_65504_P_2787_S_LEN
                 );
            localIp65504P2787SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2787SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2787S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2787S() {	 
			return (getShort(beginIp65504P2787S));
   	}
         int localIp65504P2787LCounter = -1;
         public boolean isIp65504P2787LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2787LCounter != sharedCounter;
            localIp65504P2787LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2787_L_LEN = 2;
  	/**
	 * serializeIp65504P2787L
	 */
	protected void serializeIp65504P2787L(short ip65504P2787L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2787L,IP_65504_P_2787_L_LEN)
                  ,beginIp65504P2787L
                  ,IP_65504_P_2787_L_LEN
                 );
            localIp65504P2787LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2787LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2787L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2787L() {	 
			return (getShort(beginIp65504P2787L));
   	}
         int localIp65504P2788SCounter = -1;
         public boolean isIp65504P2788SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2788SCounter != sharedCounter;
            localIp65504P2788SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2788_S_LEN = 2;
  	/**
	 * serializeIp65504P2788S
	 */
	protected void serializeIp65504P2788S(short ip65504P2788S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2788S,IP_65504_P_2788_S_LEN)
                  ,beginIp65504P2788S
                  ,IP_65504_P_2788_S_LEN
                 );
            localIp65504P2788SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2788SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2788S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2788S() {	 
			return (getShort(beginIp65504P2788S));
   	}
         int localIp65504P2788LCounter = -1;
         public boolean isIp65504P2788LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2788LCounter != sharedCounter;
            localIp65504P2788LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2788_L_LEN = 2;
  	/**
	 * serializeIp65504P2788L
	 */
	protected void serializeIp65504P2788L(short ip65504P2788L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2788L,IP_65504_P_2788_L_LEN)
                  ,beginIp65504P2788L
                  ,IP_65504_P_2788_L_LEN
                 );
            localIp65504P2788LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2788LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2788L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2788L() {	 
			return (getShort(beginIp65504P2788L));
   	}
         int localIp65504P2789SCounter = -1;
         public boolean isIp65504P2789SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2789SCounter != sharedCounter;
            localIp65504P2789SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2789_S_LEN = 2;
  	/**
	 * serializeIp65504P2789S
	 */
	protected void serializeIp65504P2789S(short ip65504P2789S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2789S,IP_65504_P_2789_S_LEN)
                  ,beginIp65504P2789S
                  ,IP_65504_P_2789_S_LEN
                 );
            localIp65504P2789SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2789SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2789S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2789S() {	 
			return (getShort(beginIp65504P2789S));
   	}
         int localIp65504P2789LCounter = -1;
         public boolean isIp65504P2789LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2789LCounter != sharedCounter;
            localIp65504P2789LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2789_L_LEN = 2;
  	/**
	 * serializeIp65504P2789L
	 */
	protected void serializeIp65504P2789L(short ip65504P2789L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2789L,IP_65504_P_2789_L_LEN)
                  ,beginIp65504P2789L
                  ,IP_65504_P_2789_L_LEN
                 );
            localIp65504P2789LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2789LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2789L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2789L() {	 
			return (getShort(beginIp65504P2789L));
   	}
         int localIp65504P2790SCounter = -1;
         public boolean isIp65504P2790SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2790SCounter != sharedCounter;
            localIp65504P2790SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2790_S_LEN = 2;
  	/**
	 * serializeIp65504P2790S
	 */
	protected void serializeIp65504P2790S(short ip65504P2790S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2790S,IP_65504_P_2790_S_LEN)
                  ,beginIp65504P2790S
                  ,IP_65504_P_2790_S_LEN
                 );
            localIp65504P2790SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2790SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2790S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2790S() {	 
			return (getShort(beginIp65504P2790S));
   	}
         int localIp65504P2790LCounter = -1;
         public boolean isIp65504P2790LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2790LCounter != sharedCounter;
            localIp65504P2790LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2790_L_LEN = 2;
  	/**
	 * serializeIp65504P2790L
	 */
	protected void serializeIp65504P2790L(short ip65504P2790L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2790L,IP_65504_P_2790_L_LEN)
                  ,beginIp65504P2790L
                  ,IP_65504_P_2790_L_LEN
                 );
            localIp65504P2790LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2790LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2790L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2790L() {	 
			return (getShort(beginIp65504P2790L));
   	}




}
  
