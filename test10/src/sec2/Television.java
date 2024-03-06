package sec2;

public class Television implements Screen{
	int volume;
	int lightness;
	int zoom;

	@Override
	public void turnOff() {
		System.out.println("전원 OFF");
	}

	@Override
	public void turnOn() {
		System.out.println("전원 ON");
	}

	@Override
	public void setVolum(int volum) {
		if (volume > MAX) {
			this.volume =  RemoteControl.MAX;
		}
		else if (volume<MIN ) {
			this.volume =  RemoteControl.MIN;
		}
		else {
			this.volume = volume;
		}
		
	}

	@Override
	public int light() {
		if (this.lightness < 255 && this.lightness<0) {
			this.lightness++;
		}
		return this.lightness;
	}

	@Override
	public int dark() {
		if (this.lightness < 255 && this.lightness<0) {
			this.lightness--;
		}
		return this.lightness;
	}

	@Override
	public int zoomin() {
		System.out.println("확대");
		if (zoom >= -500 && zoom <= 500) {
			zoom+=50;
			
		}
		return zoom;
			
	}

	@Override
	public int zoomout() {
		System.out.println("축소");
		if (zoom >= -500 && zoom <= 500) {
			zoom+=50;
			
		}
		return zoom;
	}
	
	

}
