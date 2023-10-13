package strategy.services;

public interface IGRService {
    float calculateIGR(float salaireBrutMensuel);

    float getSalaireNetMensuel(float salaireBrutMensuel);
}
