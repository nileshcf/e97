package com.cloudframe.app.sort;

import java.io.File;
import org.springframework.batch.core.configuration.annotation.JobScope;
import java.util.concurrent.ExecutorService;
import java.io.RandomAccessFile;
import java.util.Comparator;
import java.util.List;	
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;
import com.cloudframe.app.utility.SpringContextHandler;
import com.cloudframe.app.sort.file.records.McsfsortSort018Keys;
import com.cloudframe.app.sort.file.records.McsfsortSort018JoinKeys;
import com.cloudframe.app.sort.model.InMemoryKeySortKeyObject;
import com.cloudframe.app.data.Field;

@Component("batch_mcsfsortsort018")
@JobScope
public class McsfsortSort018Detail {

	private List<McsfsortSort018Keys> sortRecKeys = null;
	private List<McsfsortSort018JoinKeys> joinRecKey1 = null;
	private List<McsfsortSort018JoinKeys> joinRecKey2 = null;
	private Comparator<McsfsortSort018JoinKeys> joinkeyComp = null;
	private List<InMemoryKeySortKeyObject> jn1RecKeys = null;
	private List<InMemoryKeySortKeyObject> jn2RecKeys = null;

	protected Field field = new Field();
	private Comparator<McsfsortSort018Keys> sortComp = null;
	private AtomicInteger writeCounter = null;
	private RandomAccessFile raFile = null;
	private File tmpFile = null;
	private ExecutorService executorService = null;
	private String tempFileVal = "no";
	private int recInCounter = 0;

	public int getRecInCounter() {
		return recInCounter;
	}

	public void setRecInCounter(int recInCounter) {
		this.recInCounter = recInCounter;
	}
	
	public String getTempFileVal() {
		return tempFileVal;
	}
	
	public void setTempFileVal(String keyVal) {
		this.tempFileVal = keyVal;
	}
	
	public String useTempFile(boolean flag) {
	   if(flag) {
           setTempFileVal("yes");
       }
	   return this.tempFileVal;
    }
  
	public void setWriteCounter(AtomicInteger writeCounter) {
		this.writeCounter = writeCounter;
	}

	public AtomicInteger getWriteCounter() {
		return this.writeCounter;
	}
	/**
	 * @return the JoinRecKeys
	 */
	public List<McsfsortSort018JoinKeys> getJoinRecKey1() {
		return joinRecKey1;
	}
	/**
	 * @param JoinRecKeys to set
	 */
	public void setJoinRecKey1(List<McsfsortSort018JoinKeys> joinRecKey1) {
		this.joinRecKey1 = joinRecKey1;
	}

	/**
	 * @return the JoinRecKeys
	 */
	public List<McsfsortSort018JoinKeys> getJoinRecKey2() {
		return joinRecKey2;
	}
	/**
	 * @param JoinRecKeys to set
	 */
	public void setJoinRecKey2(List<McsfsortSort018JoinKeys> joinRecKey2) {
		this.joinRecKey2 = joinRecKey2;
	}
	
		/** @return the joinKeysComp */
	public Comparator<McsfsortSort018JoinKeys> getJoinkeySortComp() {
		return joinkeyComp;
	}

	/** @param joinKeysComp to set */
	public void setJoinkeySortComp(Comparator<McsfsortSort018JoinKeys> jnkeyComp) {
		this.joinkeyComp = jnkeyComp;
	}
	/**
	 * @return the jn1RecKeys
	 */
	public List<InMemoryKeySortKeyObject> getJn1RecKeys() {
		return jn1RecKeys;
	}

	/**
	 * @param jn1RecKeys the jn1RecKeys to set
	 */
	public void setJn1RecKeys(List<InMemoryKeySortKeyObject> jn1Keys) {
		this.jn1RecKeys = jn1Keys;
	}

	/**
	 * @return the jn2tRecKeys
	 */
	public List<InMemoryKeySortKeyObject> getJn2RecKeys() {
		return jn2RecKeys;
	}

	/**
	 * @param jn2tRecKeys the jn2tRecKeys to set
	 */
	public void setJn2RecKeys(List<InMemoryKeySortKeyObject> jn2Keys) {
		this.jn2RecKeys = jn2Keys;
	}

	/**
	 * @return the sortRecKeys
	 */
	public List<McsfsortSort018Keys> getSortRecKeys() {
		return sortRecKeys;
	}

	/**
	 * @param sortRecKeys the sortRecKeys to set
	 */
	public void setSortRecKeys(List<McsfsortSort018Keys> sortRecKeys) {
		this.sortRecKeys = sortRecKeys;
	}
	
	/**
	 * @return the sortComp
	 */
	public Comparator<McsfsortSort018Keys> getSortComp() {
		return sortComp;
	}

	/**
	 * @param sortComp the sortComp to set
	 */
	public void setSortComp(Comparator<McsfsortSort018Keys> sortComp) {
		this.sortComp = sortComp;
	}

	public void setSortFile(RandomAccessFile raFile) {
		this.raFile = raFile;
	}

	public RandomAccessFile getRaFile() {
		return this.raFile;
	}
	
	public void setTempFile(File tmpFile) {
		this.tmpFile = tmpFile;
	}
	
	public File getTempFile() {
		return this.tmpFile;
	}
	
	public void setExecutorService(ExecutorService executor) {
		this.executorService = executor;
	}
	
	public ExecutorService getExecutorService() {
		return this.executorService;
	}
	

	public String getPropKeyValue(String keyName, int num, boolean hasMoreFiles) {
		if (hasMoreFiles)
			keyName += "[" + num + "]";
		return SpringContextHandler.getValue(keyName);
	}
}
