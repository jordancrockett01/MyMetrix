package baggins.frodo.metricconversion.unused;

/**
 * Created by Zach Sogolow on 6/27/2015.
 */
public interface IConverter {
    IUnitObject UsToWorld(IUnit fromUnit, double from, IUnit toUnit);
    IUnitObject WorldToUs(IUnit fromUnit, double from, IUnit toUnit);
}