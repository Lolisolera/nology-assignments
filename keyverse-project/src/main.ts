import '../styles/styles.scss';


//** Define the mapping of notes to sound files
const noteSounds: { [key: string]: string } = {
  C: 'sounds/C.mp3',
  'C#': 'sounds/CSharp.mp3',
  D: 'sounds/D.mp3',
  'D#': 'sounds/DSharp.mp3',
  E: 'sounds/E.mp3',
  F: 'sounds/F.mp3',
  'F#': 'sounds/FSharp.mp3',
  G: 'sounds/G.mp3',
  'G#': 'sounds/GSharp.mp3',
  A: 'sounds/A.mp3',
  'A#': 'sounds/ASharp.mp3',
  B: 'sounds/B.mp3',
  C2: 'sounds/C2.mp3',
};

// Function to play sound when a key is clicked
const playSound = (note: string): void => {
  const audio = new Audio(noteSounds[note]);
  audio.play();
};

// Add event listeners to each piano key
const keys = document.querySelectorAll('.key') as NodeListOf<HTMLButtonElement>;
keys.forEach((key) => {
  key.addEventListener('click', () => {
    const note = key.getAttribute('data-note');
    if (note) {
      playSound(note);
    }
  });
});
