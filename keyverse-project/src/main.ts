import '../styles/styles.scss';

let numberOfKeys = document.querySelectorAll(".piano__key").length;

for (let i = 0; i < numberOfKeys; i++) {
  document.querySelectorAll(".piano__key")[i].addEventListener("click", function (this: HTMLElement) {
    let buttonInnerText = this.innerText.trim(); // Use .trim() to remove extra whitespace
    makeSound(buttonInnerText);
    buttonAnimation(buttonInnerText);
  });
}

document.addEventListener("keydown", (event: KeyboardEvent) => {
  makeSound(event.key.toUpperCase()); // Convert key to uppercase
  buttonAnimation(event.key.toUpperCase());
});

function makeSound(key: string): void {
  switch (key) {
    case "C":
      new Audio("./sounds/cSound.mp3").play();
      break;
    case "D":
      new Audio("./sounds/dSound.mp3").play();
      break;
    case "E":
      new Audio("./sounds/eSound.mp3").play();
      break;
    case "F":
      new Audio("./sounds/fSound.mp3").play();
      break;
    case "G":
      new Audio("./sounds/gSound.mp3").play();
      break;
    case "A":
      new Audio("./sounds/aSound.mp3").play();
      break;
    case "B":
      new Audio("./sounds/bSound.mp3").play();
      break;
    case "C2":
      new Audio("./sounds/c2Sound.mp3").play();
      break;
    case "C#":
      new Audio("./sounds/c_sharpSound.mp3").play();
      break;
    case "D#":
      new Audio("./sounds/d_sharpSound.mp3").play();
      break;
    case "F#":
      new Audio("./sounds/f_sharpSound.mp3").play();
      break;
    case "G#":
      new Audio("./sounds/g_sharpSound.mp3").play();
      break;
    case "A#":
      new Audio("./sounds/a_sharpSound.mp3").play();
      break;
    default:
      console.log(`Sound not found for key: ${key}`);
  }
}

function buttonAnimation(currentKey: string): void {
  const activeButton = document.querySelector(`.piano__key--${currentKey}`) as HTMLElement;

  if (activeButton) {
    activeButton.classList.add("pressed");

    setTimeout(() => {
      activeButton.classList.remove("pressed");
    }, 100);
  } else {
    console.error(`No button found for key: ${currentKey}`);
  }
}
