package the_essence_of_java;

class Tv4 {
	boolean power;	//	전원상태(on/off)
	int channel;	//	채널
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

class VCR {
	boolean power;	//	전원상태(on/off)	//자료형 
	int counter = 0;
	void power() {
		power = !power;
	}
	void play() {
		/*	내용생략  */
	}
	void stop() {
		/*	내용생략  */
	}
	void rew() {
		/*	내용생략  */
	}
	void ff() {
		/*	내용생략  */
	}
}

public class TVCR extends Tv4 {
	VCR vcr = new VCR();	//	VCR 클래스를 포함시켜서 사용한다.
	
	void play() {
		vcr.play();
	}
	void stop() {
		vcr.stop();
	}
	void rew() {
		vcr.rew();
	}
	void ff() {
		vcr.ff();
	}

}
