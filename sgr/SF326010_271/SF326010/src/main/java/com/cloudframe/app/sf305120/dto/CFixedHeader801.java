package com.cloudframe.app.sf305120.dto;

/**
*  The class CFixedHeader801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CFixedHeader801 extends CFixedHeader801Serialized { 
   


								@Getter @Setter private short mipCLogLnth801;

						@Getter @Setter private char[] mipCLogClassType801 = new char[2];

						@Getter @Setter private char[] mipCLogRefNum801 = new char[6];

						@Getter @Setter private char[] mipCLogBoxId801 = new char[3];

						@Getter @Setter private char[] mipCLogTime801 = new char[3];

						@Getter @Setter private char[] mipCLogDate801 = new char[3];

						@Getter @Setter private char[] clogHeaderId801 = new char[2];

						@Getter @Setter private char[] clogHeaderVersion801 = new char[1];

						@Getter @Setter private char[] clogHeaderLength801 = new char[1];

								@Getter @Setter private int clogRecordLength801;

						@Getter @Setter private char[] clogCorrelationId801 = new char[18];

						@Getter @Setter private char[] clogNumberSvcs801 = new char[1];

						@Getter @Setter private char[] clogSvcIndent801 = new char[4];

						@Getter @Setter private char[] clogSvcRqstId801 = new char[6];

						@Getter @Setter private char[] clogSvcVersion801 = new char[1];

						@Getter @Setter private char[] clogSvcHdrLnth801 = new char[1];

						@Getter @Setter private char[] clogSvcStatus801 = new char[1];

						@Getter @Setter private char[] clogStatusRtnCd801 = new char[1];

								@Getter @Setter private short clogSvcDataLnth801;
	
	/**
	* Constructor for CFixedHeader801
	**/
    public CFixedHeader801() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CFixedHeader801. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CFixedHeader801(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillLowValue(13)
             , getStartOffset() + 0
             ,13
             );
								setMipCLogLnth801((short)0);
								setMipCLogClassType801(fillSpace(2));
								setMipCLogRefNum801(fillSpace(6));
								setMipCLogBoxId801(fillSpace(3));
								setMipCLogTime801(fillSpace(3));
								setMipCLogDate801(fillSpace(3));
								setClogHeaderId801(fillSpace(2));
								setClogHeaderVersion801(fillSpace(1));
								setClogHeaderLength801(fillSpace(1));
								setClogRecordLength801(0);
								setClogCorrelationId801(fillSpace(18));
								setClogNumberSvcs801(fillSpace(1));
								setClogSvcIndent801(fillSpace(4));
								setClogSvcRqstId801(fillSpace(6));
								setClogSvcVersion801(fillSpace(1));
								setClogSvcHdrLnth801(fillSpace(1));
								setClogSvcStatus801(fillSpace(1));
								setClogStatusRtnCd801(fillSpace(1));
								setClogSvcDataLnth801((short)0);
    } 



}
  
