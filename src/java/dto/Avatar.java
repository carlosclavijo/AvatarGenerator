
package dto;

import dto.characteristics.Body;
import dto.characteristics.BowTie;
import dto.characteristics.Characteristic;
import dto.characteristics.EyeBrows;
import dto.characteristics.Eyes;
import dto.characteristics.FacialHair;
import dto.characteristics.Glasses;
import dto.characteristics.Hair;
import dto.characteristics.Hat;
import dto.characteristics.Mouth;
import dto.characteristics.Wallpaper;

/**
 *
 * @author Carlos
 */
public class Avatar {
    
    private int id;
    private int base;
    private Characteristic body;
    private Characteristic eyes;
    private Characteristic wallpaper;
    private Characteristic mouth;
    private Characteristic eyebrows;
    private Characteristic facialhair;
    private Characteristic glasses;
    private Characteristic hair;
    private Characteristic hat;
    private Characteristic bowtie;

    public Avatar() {}

    public Avatar(int id, int base, Body body, Eyes eyes, Wallpaper wallpaper, Mouth mouth, EyeBrows eyebrows, FacialHair facialhair, Glasses glasses, Hair hair, Hat hat, BowTie bowtie) {
        this.id = id;
        this.base = base;
        this.body = body;
        this.eyes = eyes;
        this.wallpaper = wallpaper;
        this.mouth = mouth;
        this.eyebrows = eyebrows;
        this.facialhair = facialhair;
        this.glasses = glasses;
        this.hair = hair;
        this.hat = hat;
        this.bowtie = bowtie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public Characteristic getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Characteristic getEyes() {
        return eyes;
    }

    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }

    public Characteristic getWallpaper() {
        return wallpaper;
    }

    public void setWallpaper(Wallpaper wallpaper) {
        this.wallpaper = wallpaper;
    }

    public Characteristic getMouth() {
        return mouth;
    }

    public void setMouth(Mouth mouth) {
        this.mouth = mouth;
    }

    public Characteristic getEyebrows() {
        return eyebrows;
    }

    public void setEyebrows(EyeBrows eyebrows) {
        this.eyebrows = eyebrows;
    }

    public Characteristic getFacialhair() {
        return facialhair;
    }

    public void setFacialhair(FacialHair facialhair) {
        this.facialhair = facialhair;
    }

    public Characteristic getGlasses() {
        return glasses;
    }

    public void setGlasses(Glasses glasses) {
        this.glasses = glasses;
    }

    public Characteristic getHair() {
        return hair;
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }

    public Characteristic getHat() {
        return hat;
    }

    public void setHat(Hat hat) {
        this.hat = hat;
    }

    public Characteristic getBowtie() {
        return bowtie;
    }

    public void setBowtie(BowTie bowtie) {
        this.bowtie = bowtie;
    }

    @Override
    public String toString() {
        return "Avatar{" + "\nid = " + id + ",\nbase = " + base + ",\nbody = " + body + ",\neyes = " + eyes + ",\nwallpaper = " + wallpaper + ",\nmouth = " + mouth + ",\neyebrows = " + eyebrows + ",\nfacialhair = " + facialhair + ",\nglasses = " + glasses + ",\nhair = " + hair + ",\nhat = " + hat + ",\nbowtie = " + bowtie + "\n}";
    }
    
}
